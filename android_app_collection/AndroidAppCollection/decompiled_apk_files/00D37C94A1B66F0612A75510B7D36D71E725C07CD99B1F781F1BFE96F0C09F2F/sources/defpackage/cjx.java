package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjx  reason: default package */
/* loaded from: classes2.dex */
public final class cjx {
    public final crm a;
    public final jk b;
    private final Class c;
    private final List d;
    private final String e;

    public cjx(Class cls, Class cls2, Class cls3, List list, crm crmVar, jk jkVar) {
        this.c = cls;
        this.d = list;
        this.a = crmVar;
        this.b = jkVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }

    public final cku a(cin cinVar, int i, int i2, cic cicVar, List list) {
        int size = this.d.size();
        cku ckuVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            cie cieVar = (cie) this.d.get(i3);
            try {
                if (cieVar.b(cinVar.a(), cicVar)) {
                    ckuVar = cieVar.a(cinVar.a(), i, i2, cicVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (ckuVar != null) {
                break;
            }
        }
        if (ckuVar != null) {
            return ckuVar;
        }
        throw new ckq(this.e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DecodePath{ dataClass=");
        sb.append(valueOf);
        sb.append(", decoders=");
        sb.append(valueOf2);
        sb.append(", transcoder=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
