package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: caep  reason: default package */
/* loaded from: classes4.dex */
public class caep implements cagg {
    private final List<cagh> a;
    private final cagd b;
    private final CharSequence c;

    public caep(caes caesVar, Activity activity, dwrz dwrzVar, cagd cagdVar) {
        this.b = cagdVar;
        ArrayList arrayList = new ArrayList();
        for (dwrc dwrcVar : dwrzVar.a) {
            cgen a = caesVar.a.a();
            caes.a(a, 1);
            caes.a(dwrcVar, 2);
            arrayList.add(new caer(a, dwrcVar));
        }
        this.a = arrayList;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activity.getString(R.string.UGC_TASKS_IMPROVE_MAP_TITLE));
        spannableStringBuilder.append((CharSequence) "   ");
        spannableStringBuilder.setSpan(new ImageSpan(activity, 2131231292), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
        this.c = spannableStringBuilder;
    }

    @Override // defpackage.cagg
    public List<cagh> a() {
        return this.a;
    }

    @Override // defpackage.cagg
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.cagg
    public Boolean c() {
        boolean z = true;
        if (this.a.size() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cagg
    public Boolean d() {
        boolean z = false;
        if (!c().booleanValue() && !this.b.ad()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
