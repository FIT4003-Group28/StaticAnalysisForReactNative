package defpackage;

import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bflh  reason: default package */
/* loaded from: classes3.dex */
public final class bflh implements bflm {
    public final cjqy a;
    public final bfli b;
    private final cjqq c;
    private final gga d;
    private final bnhv e;

    public bflh(cjqy cjqyVar, cjqq cjqqVar, gga ggaVar, bnhv bnhvVar, bfli bfliVar) {
        this.a = cjqyVar;
        this.c = cjqqVar;
        this.d = ggaVar;
        this.e = bnhvVar;
        this.b = bfliVar;
    }

    @Override // defpackage.bflm
    public final List<Pair<String, ClickableSpan>> a(ilo iloVar) {
        ArrayList arrayList = new ArrayList();
        List<dwcg> b = bfli.b(iloVar);
        for (dwcg dwcgVar : b) {
            if (arrayList.size() >= 2) {
                break;
            }
            String str = dwcgVar.d;
            arrayList.add(Pair.create(str, this.e.a(str, akqi.b(dwcgVar.e), cjtd.a(dtxr.t))));
        }
        int size = b.size() - 2;
        if (size > 0) {
            arrayList.add(Pair.create(this.d.getString(R.string.N_MORE_DEPARTMENTS, new Object[]{Integer.valueOf(size)}), new bflg(this, b, this.c.g().d(cjtd.a(dtxr.s)))));
        }
        return arrayList;
    }
}
