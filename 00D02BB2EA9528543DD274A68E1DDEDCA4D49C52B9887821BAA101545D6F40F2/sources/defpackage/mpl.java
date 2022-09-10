package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: mpl  reason: default package */
/* loaded from: classes7.dex */
public final class mpl implements mou {
    private final Runnable a;

    public mpl(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.mou
    public cjtd a() {
        return cjtd.a(dtxm.cY);
    }

    @Override // defpackage.mou
    public cqkl b() {
        this.a.run();
        return cqkl.a;
    }

    public int hashCode() {
        return Objects.hashCode("HostedEvStationsLinkViewModelImpl");
    }
}
