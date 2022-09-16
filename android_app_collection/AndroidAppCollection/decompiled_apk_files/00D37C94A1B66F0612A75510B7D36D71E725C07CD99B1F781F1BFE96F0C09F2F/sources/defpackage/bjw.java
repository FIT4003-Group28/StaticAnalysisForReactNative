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
/* renamed from: bjw  reason: default package */
/* loaded from: classes2.dex */
public final class bjw extends xo implements bje {
    public List d;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new bjt(this);
    private final Handler h = new Handler();

    public bjw(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.D = this;
        this.f = new ArrayList();
        this.d = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            q(((PreferenceScreen) preferenceGroup).d);
        } else {
            q(true);
        }
        y();
    }

    private final void A(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            list.add(o);
            bjv bjvVar = new bjv(o);
            if (!this.g.contains(bjvVar)) {
                this.g.add(bjvVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.ad()) {
                    A(list, preferenceGroup2);
                }
            }
            o.D = this;
        }
    }

    private static final boolean B(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    private final List z(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            Preference o = preferenceGroup.o(i2);
            if (o.z) {
                if (!B(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(o);
                } else {
                    arrayList2.add(o);
                }
                if (!(o instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.ad()) {
                        continue;
                    } else if (!B(preferenceGroup) || !B(preferenceGroup2)) {
                        for (Preference preference : z(preferenceGroup2)) {
                            if (!B(preferenceGroup) || i < preferenceGroup.c) {
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
        if (B(preferenceGroup) && i > preferenceGroup.c) {
            bix bixVar = new bix(preferenceGroup.j, arrayList2, preferenceGroup.jQ());
            bixVar.o = new bju(this, preferenceGroup);
            arrayList.add(bixVar);
        }
        return arrayList;
    }

    @Override // defpackage.bje
    public final void a() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        bjv bjvVar = new bjv(w(i));
        int indexOf = this.g.indexOf(bjvVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.g.size();
        this.g.add(bjvVar);
        return size;
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        if (!this.b) {
            return -1L;
        }
        return w(i).jQ();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        bke bkeVar = (bke) yoVar;
        Preference w = w(i);
        Drawable background = bkeVar.a.getBackground();
        Drawable drawable = bkeVar.t;
        if (background != drawable) {
            lj.O(bkeVar.a, drawable);
        }
        TextView textView = (TextView) bkeVar.E(16908310);
        if (textView != null && bkeVar.u != null && !textView.getTextColors().equals(bkeVar.u)) {
            textView.setTextColor(bkeVar.u);
        }
        w.qB(bkeVar);
    }

    public final Preference w(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (Preference) this.d.get(i);
    }

    @Override // defpackage.xo
    /* renamed from: x */
    public final bke f(ViewGroup viewGroup, int i) {
        bjv bjvVar = (bjv) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, bkf.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = po.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bjvVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            lj.O(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = bjvVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new bke(inflate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        for (Preference preference : this.f) {
            preference.D = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        A(arrayList, this.e);
        this.d = z(this.e);
        bkb bkbVar = this.e.k;
        mr();
        for (Preference preference2 : this.f) {
        }
    }
}
