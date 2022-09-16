package defpackage;
/* compiled from: PG */
/* renamed from: addm  reason: default package */
/* loaded from: classes.dex */
final class addm implements yiw {
    final /* synthetic */ addn a;

    public addm(addn addnVar) {
        this.a = addnVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        adit aditVar = (adit) obj;
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Error attempting pairing: ");
        sb.append(valueOf);
        zep.b(sb.toString());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        adit aditVar = (adit) obj;
        this.a.a.R((adif) obj2, new joq(2));
    }
}
