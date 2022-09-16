package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sgs  reason: default package */
/* loaded from: classes4.dex */
public final class sgs implements sgp {
    private final sgp a;

    public sgs(sgp sgpVar) {
        this.a = sgpVar;
    }

    @Override // defpackage.sgp
    public final /* bridge */ /* synthetic */ Object a(Object obj, int i, sgt sgtVar) {
        Object a = this.a.a(obj, i, sgtVar);
        return a == null ? "null" : a.toString();
    }
}
