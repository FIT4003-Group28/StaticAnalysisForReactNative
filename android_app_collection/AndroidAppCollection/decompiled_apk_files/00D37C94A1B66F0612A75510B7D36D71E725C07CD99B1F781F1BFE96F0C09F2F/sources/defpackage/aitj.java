package defpackage;
/* compiled from: PG */
/* renamed from: aitj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aitj implements ayqe {
    public final /* synthetic */ ampg a;
    private final /* synthetic */ int b;

    public /* synthetic */ aitj(ampg ampgVar) {
        this.a = ampgVar;
    }

    public /* synthetic */ aitj(ampg ampgVar, int i) {
        this.b = i;
        this.a = ampgVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        awkm awkmVar;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ampg ampgVar = this.a;
                String str = (String) obj;
                try {
                    awkmVar = (awkm) aopi.parseFrom(awkm.a, aakj.b(str), aoos.b());
                } catch (aopx unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 92);
                    sb.append("Found entityKey=`");
                    sb.append(str);
                    sb.append("` that does not contain a PlaylistVideoEntityId message as it's identifier.");
                    zep.b(sb.toString());
                    awkmVar = null;
                }
                return awkmVar != null ? (String) ampgVar.apply(awkmVar.c) : "";
            }
            ahic ahicVar = (ahic) obj;
            return ((aynx) this.a.apply(ahicVar.a())).C(new ibq(ahicVar, 2));
        }
        return (bamd) this.a.apply(((ahic) obj).a());
    }
}
