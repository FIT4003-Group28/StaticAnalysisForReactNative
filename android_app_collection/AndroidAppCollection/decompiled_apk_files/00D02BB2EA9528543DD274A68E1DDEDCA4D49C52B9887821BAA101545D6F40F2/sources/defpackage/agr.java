package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agr  reason: default package */
/* loaded from: classes.dex */
public final class agr extends agq {
    final /* synthetic */ int a;
    final /* synthetic */ agz b;
    final /* synthetic */ String c;
    final /* synthetic */ agu d;

    public agr(agu aguVar, int i, agz agzVar, String str) {
        this.d = aguVar;
        this.a = i;
        this.b = agzVar;
        this.c = str;
    }

    @Override // defpackage.agq
    public final void a() {
        agu aguVar = this.d;
        String str = this.c;
        Integer remove = aguVar.d.remove(str);
        if (remove != null) {
            aguVar.c.remove(remove);
        }
        aguVar.f.remove(str);
        if (aguVar.g.containsKey(str)) {
            String str2 = "Dropping pending result for request " + str + ": " + aguVar.g.get(str);
            aguVar.g.remove(str);
        }
        if (aguVar.h.containsKey(str)) {
            String str3 = "Dropping pending result for request " + str + ": " + aguVar.h.getParcelable(str);
            aguVar.h.remove(str);
        }
        if (aguVar.e.get(str) == null) {
            return;
        }
        throw null;
    }

    @Override // defpackage.agq
    public final void b(Object obj) {
        this.d.a(this.a, this.b, obj);
    }
}
