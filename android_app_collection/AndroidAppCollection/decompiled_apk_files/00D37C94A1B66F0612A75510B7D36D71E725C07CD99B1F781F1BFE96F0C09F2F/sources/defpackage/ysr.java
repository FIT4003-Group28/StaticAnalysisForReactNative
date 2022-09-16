package defpackage;
/* compiled from: PG */
/* renamed from: ysr  reason: default package */
/* loaded from: classes4.dex */
public final class ysr extends ysj {
    public ysr(String str) {
        super(str);
    }

    @Override // defpackage.ysj
    protected final boolean a(String str) {
        return !"Accept-Encoding".equalsIgnoreCase(str);
    }
}
