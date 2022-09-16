package defpackage;
/* compiled from: PG */
/* renamed from: jjf  reason: default package */
/* loaded from: classes3.dex */
final class jjf implements yiw {
    final /* synthetic */ jjg a;

    public jjf(jjg jjgVar) {
        this.a = jjgVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = (String) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        agqh agqhVar = (agqh) obj2;
        if (agqhVar == null || this.a.ak.isCancelled()) {
            return;
        }
        jjg jjgVar = this.a;
        jjgVar.aj = agqhVar.a.b;
        jjgVar.aq = null;
        ((frv) jjgVar.af.get()).j();
        jjg jjgVar2 = this.a;
        jev jevVar = jjgVar2.al;
        String str2 = jjgVar2.aj;
        ajru ajruVar = jevVar.v;
        if (ajruVar == null) {
            return;
        }
        ajruVar.oK(new ajrs(), new fsl(str2));
    }
}
