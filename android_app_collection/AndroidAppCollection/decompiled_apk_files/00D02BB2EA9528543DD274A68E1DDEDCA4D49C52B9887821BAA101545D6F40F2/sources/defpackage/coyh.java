package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
/* compiled from: PG */
/* renamed from: coyh  reason: default package */
/* loaded from: classes.dex */
public interface coyh extends IInterface {
    void b(Status status);

    void c(Status status);

    void d(Status status);

    void e(Status status);

    void f(Status status, Configurations configurations);

    void g(Status status);

    void h(Status status, ExperimentTokens experimentTokens);

    void i(Status status, DogfoodsToken dogfoodsToken);

    void j(Status status);

    void k(Status status, Flag flag);

    void l(Status status, Configurations configurations);

    void m(Status status, long j);

    void n(Status status);

    void o(Status status, FlagOverrides flagOverrides);

    void p(Status status);

    void q(Status status, long j);
}
