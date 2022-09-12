package defpackage;
/* compiled from: PG */
/* renamed from: cyrv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyrv implements cyqo {
    @Override // defpackage.cyqo
    public final long a() {
        return b(new avt("PRAGMA page_count")) * b(new avt("PRAGMA page_size"));
    }

    public abstract long b(awb awbVar);
}
