package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bi  reason: default package */
/* loaded from: classes2.dex */
final class bi implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    public final void a(bh bhVar) {
        String str = bhVar.a;
        for (bh bhVar2 : this.b) {
            if (str.equals(bhVar2.a)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate keyword: ".concat(valueOf) : new String("Duplicate keyword: "));
            }
        }
        this.b.add(bhVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (bh bhVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(bhVar);
        }
        return sb.toString();
    }
}
