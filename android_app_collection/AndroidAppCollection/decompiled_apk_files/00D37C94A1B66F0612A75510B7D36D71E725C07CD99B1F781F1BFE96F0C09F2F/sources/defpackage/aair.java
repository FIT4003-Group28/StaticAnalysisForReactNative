package defpackage;
/* compiled from: PG */
/* renamed from: aair  reason: default package */
/* loaded from: classes.dex */
final class aair extends aahw {
    private final aajb a;
    private final String b;
    private final aorw c;

    public aair(aajb aajbVar, String str, aorw aorwVar) {
        this.a = aajbVar;
        this.b = str;
        this.c = aorwVar;
    }

    @Override // defpackage.aahw
    public final void b(aaip aaipVar, vox voxVar, amuf amufVar) {
        aajj aajjVar;
        aakd c = this.a.c(voxVar, this.b);
        if (!aajz.d(c.d, this.c) || (aajjVar = c.b) == null) {
            return;
        }
        if (amufVar != null) {
            aajn a = aajp.a();
            a.c(this.b);
            a.a = aajjVar;
            a.d(c.c);
            a.b(aajk.a);
            amufVar.h(a.a());
        }
        String str = this.b;
        try {
            String[] strArr = {str};
            vox.c();
            StringBuilder sb = new StringBuilder(36);
            sb.append("DELETE FROM ");
            sb.append("entity_table");
            sb.append(" WHERE ");
            sb.append("key=?");
            amlp l = amna.l(sb.toString());
            voxVar.b.delete("entity_table", "key=?", strArr);
            l.close();
            voxVar.e("DELETE FROM entity_associations WHERE parent_entity_key=? OR child_entity_key=?", str, str);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw aahd.c(e, (int) d(str));
        }
    }
}
