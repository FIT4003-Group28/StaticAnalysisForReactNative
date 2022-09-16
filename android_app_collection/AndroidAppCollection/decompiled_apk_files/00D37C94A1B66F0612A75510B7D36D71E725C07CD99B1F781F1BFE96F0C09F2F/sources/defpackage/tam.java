package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: tam  reason: default package */
/* loaded from: classes4.dex */
final class tam implements ayqe {
    private final amup a;
    private final awne b;

    public tam(amup amupVar, awne awneVar) {
        this.a = amupVar;
        this.b = awneVar;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aopa createBuilder = awne.a.createBuilder(this.b);
        amzs it = ((amup) obj).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) this.a.get(entry.getKey());
            str.getClass();
            aopa createBuilder2 = awnf.a.createBuilder();
            aoob x = aoob.x((byte[]) entry.getValue());
            createBuilder2.copyOnWrite();
            awnf awnfVar = (awnf) createBuilder2.instance;
            awnfVar.b = 5;
            awnfVar.c = x;
            createBuilder.aY(str, (awnf) createBuilder2.mo39build());
        }
        return (awne) createBuilder.mo39build();
    }
}
