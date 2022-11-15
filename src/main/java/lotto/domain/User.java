package lotto.domain;

import java.math.BigInteger;
import java.util.List;

public class User {

    private List<Lotto> lottosPublished;
    private BigInteger lottoFee;

    public User() {

    }

    void setLottos(List<Lotto> lottos) {
        this.lottosPublished = lottos;
    }

    public List<Lotto> getLottosPublished() {
        return lottosPublished;
    }

    void setLottoFee(BigInteger lottoFee) {
        this.lottoFee = lottoFee;
    }

    public BigInteger getLottoFee() {
        return this.lottoFee;
    }
}
