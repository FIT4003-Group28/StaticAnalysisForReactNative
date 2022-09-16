package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: isi  reason: default package */
/* loaded from: classes3.dex */
public final class isi implements aapm {
    private final Context a;
    private final SharedPreferences b;
    private final azqb c;
    private final axnm d;
    private final azqb e;
    private final azqb f;

    public isi(Context context, SharedPreferences sharedPreferences, azqb azqbVar, axnm axnmVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = context;
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        azqbVar.getClass();
        this.c = azqbVar;
        axnmVar.getClass();
        this.d = axnmVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
    }

    public final void a() {
        this.c.get();
    }

    @Override // defpackage.aapm
    public final void b(aopa aopaVar) {
        String string = this.b.getString(etk.COUNTRY, "");
        if (!TextUtils.isEmpty(string)) {
            aopaVar.copyOnWrite();
            arow arowVar = (arow) aopaVar.instance;
            arow arowVar2 = arow.a;
            string.getClass();
            arowVar.b |= 16;
            arowVar.i = string;
        }
        try {
            String str = (String) anlz.c(((abfh) this.f.get()).d());
            if (!TextUtils.isEmpty(str)) {
                aopaVar.copyOnWrite();
                arow arowVar3 = (arow) aopaVar.instance;
                arow arowVar4 = arow.a;
                str.getClass();
                arowVar3.b |= 128;
                arowVar3.j = str;
            }
        } catch (ExecutionException e) {
            zep.d("Failed to read the internal geo.", e);
        }
        if (TextUtils.isEmpty(null)) {
            if (this.a.getResources().getString(R.string.application_name).startsWith("\u200e\u200f\u200e\u200e")) {
                aopaVar.copyOnWrite();
                arow arowVar5 = (arow) aopaVar.instance;
                arow arowVar6 = arow.a;
                arowVar5.b |= 4;
                arowVar5.g = true;
            }
            aopaVar.copyOnWrite();
            arow arowVar7 = (arow) aopaVar.instance;
            arow arowVar8 = arow.a;
            arowVar7.L = ((arot) this.c.get()).f;
            arowVar7.d |= 16;
            asvj c = ((acqs) this.d.get()).c();
            if (c != null) {
                aopaVar.copyOnWrite();
                arow arowVar9 = (arow) aopaVar.instance;
                arowVar9.k = c;
                arowVar9.b |= 1024;
            }
            anva anvaVar = (anva) ((jvk) this.e.get()).b.get("com.youtube.mainapp.android");
            if (anvaVar == null) {
                return;
            }
            aopaVar.copyOnWrite();
            arow arowVar10 = (arow) aopaVar.instance;
            aopu aopuVar = arowVar10.o;
            if (!aopuVar.c()) {
                arowVar10.o = aopi.mutableCopy(aopuVar);
            }
            arowVar10.o.add(anvaVar);
            return;
        }
        aopaVar.copyOnWrite();
        arow arowVar11 = (arow) aopaVar.instance;
        arow arowVar12 = arow.a;
        throw null;
    }
}
