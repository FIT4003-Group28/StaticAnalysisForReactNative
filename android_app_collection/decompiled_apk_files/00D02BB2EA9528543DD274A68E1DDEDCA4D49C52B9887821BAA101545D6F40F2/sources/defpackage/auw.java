package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: auw  reason: default package */
/* loaded from: classes2.dex */
public final class auw extends abg<ave> implements aua, aur {
    public List<Preference> a;
    private final PreferenceGroup e;
    private List<Preference> f;
    private final List<auv> g;
    private final Runnable i = new aut(this);
    private final Handler h = new Handler();

    public auw(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.A = this;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            j(((PreferenceScreen) preferenceGroup).e);
        } else {
            j(true);
        }
        y();
    }

    private final void A(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int n = preferenceGroup.n();
        for (int i = 0; i < n; i++) {
            Preference o = preferenceGroup.o(i);
            list.add(o);
            auv auvVar = new auv(o);
            if (!this.g.contains(auvVar)) {
                this.g.add(auvVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.ai()) {
                    A(list, preferenceGroup2);
                }
            }
            o.A = this;
        }
    }

    private final List<Preference> B(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int n = preferenceGroup.n();
        int i = 0;
        for (int i2 = 0; i2 < n; i2++) {
            Preference o = preferenceGroup.o(i2);
            if (o.v) {
                if (!C(preferenceGroup) || i < preferenceGroup.d) {
                    arrayList.add(o);
                } else {
                    arrayList2.add(o);
                }
                if (!(o instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.ai()) {
                        continue;
                    } else if (!C(preferenceGroup) || !C(preferenceGroup2)) {
                        for (Preference preference : B(preferenceGroup2)) {
                            if (!C(preferenceGroup) || i < preferenceGroup.d) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (C(preferenceGroup) && i > preferenceGroup.d) {
            atq atqVar = new atq(preferenceGroup.j, arrayList2, preferenceGroup.Ng());
            atqVar.o = new auu(this, preferenceGroup);
            arrayList.add(atqVar);
        }
        return arrayList;
    }

    private static final boolean C(PreferenceGroup preferenceGroup) {
        return preferenceGroup.d != Integer.MAX_VALUE;
    }

    @Override // defpackage.aua
    public final void a() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    @Override // defpackage.aur
    public final int b(Preference preference) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = this.a.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.abg
    public final int c() {
        return this.a.size();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ ave d(ViewGroup viewGroup, int i) {
        auv auvVar = this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, avf.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = sl.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(auvVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            od.U(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = auvVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new ave(inflate);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(ave aveVar, int i) {
        ave aveVar2 = aveVar;
        Preference z = z(i);
        Drawable background = aveVar2.a.getBackground();
        Drawable drawable = aveVar2.s;
        if (background != drawable) {
            od.U(aveVar2.a, drawable);
        }
        TextView textView = (TextView) aveVar2.C(16908310);
        if (textView != null && aveVar2.t != null && !textView.getTextColors().equals(aveVar2.t)) {
            textView.setTextColor(aveVar2.t);
        }
        z.Rk(aveVar2);
    }

    @Override // defpackage.abg
    public final int i(int i) {
        auv auvVar = new auv(z(i));
        int indexOf = this.g.indexOf(auvVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.g.size();
        this.g.add(auvVar);
        return size;
    }

    @Override // defpackage.abg
    public final long k(int i) {
        if (!this.c) {
            return -1L;
        }
        return z(i).Ng();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        for (Preference preference : this.f) {
            preference.A = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        A(arrayList, this.e);
        this.a = B(this.e);
        avb avbVar = this.e.k;
        s();
        for (Preference preference2 : this.f) {
        }
    }

    public final Preference z(int i) {
        if (i < 0 || i >= c()) {
            return null;
        }
        return this.a.get(i);
    }
}
