package com.example.hw453;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw453.databinding.FragmentCountriesBinding;

import java.util.ArrayList;

public class CountriesFragment extends Fragment {

    private FragmentCountriesBinding binding;
    private ArrayList<Country> countriesLise = new ArrayList<>();
    private CountriesAdapter countriesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int pos = getArguments().getInt("key");

        checkPos(pos);

        countriesAdapter = new CountriesAdapter(countriesLise);
        binding.rvCounties.setAdapter(countriesAdapter);
    }

    private void checkPos(int pos) {
        if (pos == 0){
            loadAsia();
        }
        if (pos == 1){
            loadAfrica();
        }
        if (pos == 2){
            loadЕвропа();
        }
        if (pos == 3){
            loadNothAmerica();
        }
    }

    private void loadNothAmerica() {
        countriesLise.add(new Country("Соединенные Штаты Америким", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHkAAABACAMAAAAJUSgeAAAAnFBMVEX///+yIjQ8O26xHTGtABmxGS7AXmetABywECjOiY+4PUrpzc/26uvcrrKuACI6OW20s8I1NGosKmU0PHAxMGiMLU5RUHtjYodMS3ifn7O+vcpFRHNBQHEjImHd3eRYV4D29vipqbuJiaOUlKvm5uuCgZ0cG150dJPPz9lubY8VE1uQPFnFxdCIHEOVT2gSD1uum6uebIGmhpjNsLj2n0eBAAAEAklEQVRYhe2Z25LbNgxAWSZp0lsg0FxRd1KWZEmutunl//+tAOi0eeh0xh7M7MMuxjPH3IeFSeqAMG0sBVj7Df598x88Pb37TicM/T+oUP5v12Z+HfsyE/PY8lgzM8R6DDQbiFORuTTCcjky141pq30LypmTyRmS2WlyUM1mZXaDWWSygzkzYTM1np4+vNMJyoxFwUtqcRxLILoi04/1DpbGRORxXS94+vVHpTC8f976uDqLnvKcM9tMuNa9RWfBTT2gB+saoxXy7OA6J15R3Oc0eWIYaGVpJYij550YTCFPuHJmsNchXZn9NncAxCMh8LhJkemKFJCtUs0MlmyJbYUdvZhQIgaM4CMCEfkVXKCxV80MYSzoCQIMdbPTfMmujciWbSuzXIadJIdqGVbri5+VgjJXyUS2qr2xm0242bQKN7EL8DATnp7fKwXvc113lidXT5Hn7MaJ9xawPu+8x75eVloTIJJVmtWTrcKwkFoesJ2cjCsmPWSXsWdSWrILdatntiplq9bZsFUQ5mxV/NYq1ur09OmDTvxj1XzhFe+3oRWbjtly/eqP4WbVTJWVPsvpt++VgjKTSp6OqQrbGyF4KPuIbve2cqwYjS8ReOwOPatwbQ56gqh+NdsiHAdhGIczM9bzWewi6lYSTKnjLcTZ8EqDG0wpK7wZqVs0zV3YkF2qmdvzueV+AKaFrOosTmuUT3LeuaJYPwUhTmHVzUy2WBcWscdX9YWJTLIIr8UXGiO68QsQrf/9J6W4WbUYqk98ViVTi1XpdlYlU4hVs2myVc/vP+qEkcbLXrehz1Zt1c2mzIY6IekWtjVbpVlJsA2+8z35RETXIeweoK/Qc7dAf8fV0WdqoaexZmZcti3Xr2PI3UEzy8oHJj3koUi1dIbFXMPp+fMnnaA5X1Jy0g3MxvOmXwYjW9pvbBexMZHPLFfQ2YV//KAUbNW6tjwnu4RIRwYg01JrssSQx+WOmWSVYg1jq+jUr0tg7kUlDGNlWa7qyIxNy1TvANke6bGp95YugCw6S+89iGW2yx2hdgcIbNEBTN80pdhUNDHbVOzCschWqWb25U5dgOsyqSsAtonscov02uiJQD335dyD//MXpWCrhjlbNWSb9m3OdWxLo+wAk8+qIxXUh338rBM05+s897yF/ZCcWLUlsas/TAXZJrHLjXRmqdawKoRWvj/sUc4oWMuYx5V8h8S1+8odFDM75/reSdzwP6R3eqtd3Bl/qT1hb/E6QuvQu/+UVDrnH+gMlOrCA5Xk5TIr9bAPdL1ajfv9nf5bvI7Quny4/7ZC6b7lgRual6skL5dZ6zLx/ttHrQvU+29c3+J1hNaPQPf/aqT0u9cDv5S9XCV5hZn/BuDQw3yWb4KpAAAAAElFTkSuQmCC"));
        countriesLise.add(new Country("Канада", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr-73BlEB_zNYogVDjzBDXWISoSYjlw635IJRTIBw&s"));
        countriesLise.add(new Country("Мексика", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjGBdy4P3zCOH6RGwDPL6GxUs7fMn9uOi1udP2mwk&s"));
        countriesLise.add(new Country("Гренландия", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwFy5-s7H_R4WvpqSG_H-khqXb9xM7DesM8_KMaG_V&s"));
        countriesLise.add(new Country("Коста-Рика", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRouDG0-iacDE4SnCccfqqEI5BcQ9pevabvS-eQE8k&s"));
        countriesLise.add(new Country("Куба", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2PwzweEjrLn3PwwMo3dYylQWvn692sumu4Z2ukiY&s"));
    }

    private void loadЕвропа() {
        countriesLise.add(new Country("Германия", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUMO-chEX0pTKjZUVPmBRCtid01RQ78raJCxJXJzU&s"));
        countriesLise.add(new Country("Италия", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVz3SztMbnpzEeuWhMldzpr42pANJ7t-_bVyujxtrq&s"));
        countriesLise.add(new Country("Великобритания", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0E6teYqqeIx_YOuXLM2vZJ87FR-N6GU61WnOaaPg&s"));
        countriesLise.add(new Country("Франция", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBT1QeSl-TUygr_PHzHzWsUzSL9SZg5bttpGNaQ0Tz&s"));
        countriesLise.add(new Country("Украина", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTGyv-M-Z6PxjsJBCcyVNCO19kKOlMbA6GjXOkaMdg&s"));
    }

    private void loadAfrica() {
        countriesLise.add(new Country("Южная Африка", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALYAAAB5CAMAAACjkCtXAAAA51BMVEUAeEcADIrhOS3///8AAAD/uRUAcz75/ftlpIYAAH/fFwD1y8rLytz/vRX/uxMAdkgAAIjhNSgAc0ri7ujgLR776egAai0AcDi41MczhFktfkPs9fFxp4sXEQKjdg2tzb0nHAMNCQHVnBE8KwTbrx/pfHbJqiX0wL7iQzjgJBBiiTwdflCqny3vtBq7oygae0Xyt7R9kTdbQgjnqhNJNQaJljLkU0p+rpWVmy80JgSgni2WbwzKlBBUhz2FYgrm5/Kxs9XqhoDncWsaHI5VV6Q1OJjZ2utsbrApKpJfYadwjjh4erSkps4b34v9AAAESklEQVR4nNWciVrTQBRGpzKJZckAChSwLaCILC0oLqgViyDgwvs/jxOC7SwJuZPkznJfgPP93+GfSTJTQnKn+3xGmNXLleUnXk0+NelsrIvcM2+WV1yTSlOATchaWw78x4FPgRdik1gJ/O0TjwIvxtYDf+2P4Y9h64Yf+BL4o9g5hs/5EXgJtm74vheBl2FzU3w0vBzbS8MB2Nzwrm8dDsIm8ZFnhsOwU8Nf+GQ4FJtXypZsuNNFk2wuQsFVw10GTnYPF6HgHhlOWDI4eQYOXDXcVaWQKGLDQwIOXDXcUeAcO2Ls+ATMvXbmg+EpNgff/ROW4Rk2D3ywCTa803Vu+AN2PcPtBz7BjlhyDK6UeE0N3PI+nLBoCj58Z2L4U6lSPh1Yxe5HyZSbHZsYrlSKTcMJPX0vBx6E4YTSXj9JRMPBgcda4NYM59iUnr5MKgZ+tKUYbinwe2weeEXD49hNh2fY9QKXDbcS+H9sut1nAQU+wa4T+Ibc4RYqRcCmO5UrxfqiKWJT+kEKPPkID5zYNVzG5oYnrJLhRDMcNXAFWw18WD1w1AcfDZt3OBPB9wwCP5MDR3w9q2OngYu7lOizQeDKgw+a4XnY6S5FNNwk8K5UhauXSIHnYlP6Ra4UeOAdxfD5/TmMKcCWF03+iGywaCqGz2NMEbZqODMyXDIFY4qx+aLJBPCkuuF2sXXDwS+BVMPtYtPtUVTZcNTAH8em9NU3kZt9hVdKvF7+19GwaW8Uif+ae+dgwwmi4aXYPHClUuCG8ydNpAFg88DFDk9MDG8jDQRbNTyBGx4jDQyb7siG756D37ohDQw7NVyuFLDhbrHTSkn8CRyMfW848yVwA2xK+0PF8DCwFcOTAbhS3GLT3nc/DDfE5vtw2fCBG8ONsSkdDUVug6/fbrF5pUi7lAH8uIFTbNqTF/u9kyCww0x7JLd3GG4H2SRh9naYq2SQe5Igd4Bh7reDfLoJ81kyyCf3MN+TBPlWqsY7wLa7d4BBvnEN8/12kF8Twvx2E+SXssa+S94sYAz2V+CFq1mMwf3mPv45u9TCGNQTDnfXONB52I2dJ7m5RYo6D7ux0zsXv9CgNezGzkqNf+NFrWE3djLt4noWEVrGbuwc4A1u1DJ2Y6cuUa1WsBs744pstYzd2IlivK7WsRs7v41vtYDd2Gl5C1ZPsOW7CSZRK3cTxojLoobd2E2QO1tRp9hN3buxGHWK3dAtJ2tWP2CLy2LlO2VWujoXu84NPstRT7Hr3Jcc3y7Zpm7Vv51qP+oHbLO7wEqB/LVs9QS7ltVXLqDTAqxxz916gUyxa/yqgM1lUcWu/BsOmA/m5djQ0axuuYOGY3dUq+13tTm21tWOCsQMW+1ql1aDsdVfOrpwDg3BVn5XyrXVMGz1V7ycW51NmdVtH3Yg+phZ7YMf92MStRdWZwO3+s4Pq7OBW+1P1K1CbH+tzqYAu+ut1dn8A+SMHX7n7HnSAAAAAElFTkSuQmCC"));
        countriesLise.add(new Country("Нигерия", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStiIw3qWzd2qP9s2hNA_LGyxnlTbNCqmaUj_ydbZY&s"));
        countriesLise.add(new Country("Марокко", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbwE8DUrQUtwBcD1yNepicStq7glDFanpjLKuJHjnX&s"));
        countriesLise.add(new Country("Кения", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdoz3g8jp94izWZ9rvvMMYDa13PVP-Ei11Er0Ihbq6&s"));
        countriesLise.add(new Country("Гана", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZjAXNaI-SRZm8l0l8STtDn89yKwOIs2T8rFCWer06&s"));
    }

    private void loadAsia() {
        countriesLise.add(new Country("Япония", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALYAAAB5CAMAAACjkCtXAAAAeFBMVEX///+8AC22AAC7ACq5AB26ACG7ACX++vu4AA24ABG5ABm5ABv+/Pzx1drOcHe7Eifmt7zy297qwce8Gy/rx8vfp6rDOE356+3alpv68PL25efdn6XVi43TfYLQdnzGRlnITl3KXmfBNETFTVbDRk3JVWPHWF++LDdX00ngAAACi0lEQVR4nO2bi5KqMAxAsbS83+IKIqLruv7/H166zN7VXVEenYbM5HzBmU5Ik5AaBkEQBEEQBEEQBEEQBBaCwLaDANpiDHaYVPv6EEWHel8loQ3tM4AyrZprLHyfcyE4930RX5sqLaG9nhIWZ+ZY5uoO03LYcR9Cu/Vh50fuW6uHWD4/5ouMluzExGPnDsFOGbTjH9KL23PQN0fuXlJoz3uqmL+SlvC4gja9Yffpmq+dJab7uYO2/SZ894ZJS7z3heSUhL2M6lsslkAbSzJvYID8DxRvARklYSOtW2/4887FaOvWW+Sw1qkzwbr1dkATeHl+ejH2I86QxVU0IvPd40Vw1hmbar1aMbB0sr1OCuwO87oF0i4mh4jEK2CsdzNCRMJgqpODP0/bP0BYh+sZkS0x1xBF1bzIlkBEd/C7051w3Kb+7nJOzv6G6S9NoonX+i1C+1VZfsyOkTZKPnRXJvmojqYPS3eUbFwV2u5Gs3Y0aMDwCq47uN/UBMmbXutg6GDkOaardwK+VZC1JUxv9Zqq0tbbU+aqtPVWUyqu9i9tva0ZaetEWWzrvd2RZhKkeRvpLYm0JsFaAW4cFdra622k3Q3SXhJp567kngSYk9gKplIWwM4Dzhkg1omrcZh53B7IfBvr3wSk/26M3bw/ZWCLJTj/S875KoG+xw6k/9yRbjhg3SfBur3TphM+dleKL2BXqj1vZ9xmmrOAs5bg3ANsr8vT8K3L02K2Lg2kO64G1o3iluzyfGnUYpdFZJDf2HnDvf5t+WaZ2/KSsDg+epvgsqZYTP54iHwJso6F73UvQbyvlyDFwl+CdJRhUhV1HUV1XSB5d/ODfOUE7UAQBEEQBEEQBEEQBDGcf6ysKSqK2rjgAAAAAElFTkSuQmCC"));
        countriesLise.add(new Country("Индонезия", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6nYZlbR3nNPFPC_1CFBJ40O6AisZCgLLZyOu_3Cth&s"));
        countriesLise.add(new Country("Китай", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYi3AYnFWMlXqCp8uoQuwRF0ykOshnIoic5D8RBbrg&s"));
        countriesLise.add(new Country("Индия", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKESdPJ96Ae0c3FybPapmAHJMFLx-FWbHwGyTiX_T2&s"));
        countriesLise.add(new Country("Южная Корея", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6yh0HLupZo-VZByrVvzsyBGDPkRZx2A420A-RigTd&s"));
    }
}