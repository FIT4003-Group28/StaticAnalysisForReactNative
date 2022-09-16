package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.File;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: pdn  reason: default package */
/* loaded from: classes4.dex */
final class pdn {
    public final pdm c;
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final SparseBooleanArray e = new SparseBooleanArray();

    public pdn(File file, byte[] bArr, boolean z) {
        this.c = new pdl(new File(file, "cached_content_index.exi"), bArr, z);
    }

    public final pdk a(String str) {
        return (pdk) this.a.get(str);
    }

    public final pdk b(String str) {
        pdk pdkVar = (pdk) this.a.get(str);
        if (pdkVar == null) {
            SparseArray sparseArray = this.b;
            int size = sparseArray.size();
            int i = 0;
            int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
            if (keyAt < 0) {
                while (i < size && i == sparseArray.keyAt(i)) {
                    i++;
                }
                keyAt = i;
            }
            pdk pdkVar2 = new pdk(keyAt, str, pdr.a);
            this.a.put(str, pdkVar2);
            this.b.put(keyAt, str);
            this.e.put(keyAt, true);
            this.c.c();
            return pdkVar2;
        }
        return pdkVar;
    }

    public final void c(String str) {
        pdk pdkVar = (pdk) this.a.get(str);
        if (pdkVar == null || !pdkVar.b() || pdkVar.e) {
            return;
        }
        this.a.remove(str);
        int i = pdkVar.a;
        boolean z = this.e.get(i);
        ((pdl) this.c).a = true;
        if (z) {
            this.b.remove(i);
            this.e.delete(i);
            return;
        }
        this.b.put(i, null);
        this.d.put(i, true);
    }

    public final void d() {
        pdm pdmVar = this.c;
        HashMap hashMap = this.a;
        pdl pdlVar = (pdl) pdmVar;
        if (pdlVar.a) {
            pdlVar.a(hashMap);
            pdlVar.a = false;
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.d.keyAt(i));
        }
        this.d.clear();
        this.e.clear();
    }
}
