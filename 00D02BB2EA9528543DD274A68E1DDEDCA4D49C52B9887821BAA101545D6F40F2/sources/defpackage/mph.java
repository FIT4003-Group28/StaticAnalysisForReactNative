package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: mph  reason: default package */
/* loaded from: classes7.dex */
public final class mph implements mos {
    private final Context a;
    private final List<mpb> b = new ArrayList();
    private final dndr c;
    private String d;

    public mph(Context context, ldm ldmVar, dndr dndrVar) {
        this.a = context;
        boolean z = true;
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
            z = false;
        }
        dbsk.l(z);
        this.c = dndrVar;
        this.d = dbsj.e(ldmVar.a);
        d(ldmVar);
    }

    @Override // defpackage.mos
    public CharSequence a() {
        if (this.c == dndr.WORK) {
            return this.a.getString(R.string.ADDRESS_TYPE_WORK);
        }
        return this.a.getString(R.string.ADDRESS_TYPE_HOME);
    }

    @Override // defpackage.mos
    public List<mpb> b() {
        return this.b;
    }

    @Override // defpackage.mos
    public String c() {
        return this.d;
    }

    public void d(ldm ldmVar) {
        this.b.clear();
        ilo iloVar = ldmVar.d;
        if (iloVar == null) {
            this.d = dbsj.e(ldmVar.a);
        } else {
            if (iloVar.j()) {
                int e = irh.r().e(this.a);
                SpannableString c = npq.c(itd.d(nql.br.a).a(this.a), e, e);
                SpannableString c2 = npq.c(itd.d(nql.br.b).a(this.a), e, e);
                String string = this.a.getString(R.string.CAR_SEARCH_PLACE_IS_OFFLINE);
                this.b.add(new mqb(10.0f, iva.h(TextUtils.concat(c, " ", string), TextUtils.concat(c2, " ", string)), cjtd.b));
            }
            this.b.add(new mqb(4.0f, iloVar.n(), cjtd.b));
            List<String> A = iloVar.A();
            if (A.size() > 0) {
                this.b.add(new mqb(3.0f, A.get(0), cjtd.b));
            }
            if (A.size() > 1) {
                ListIterator<String> listIterator = A.listIterator(1);
                for (float f = 2.0f; listIterator.hasNext() && f > 0.0f; f -= 1.0f) {
                    this.b.add(new mqb(f, listIterator.next(), cjtd.b));
                }
            }
        }
        cqkx.p(this);
    }
}
