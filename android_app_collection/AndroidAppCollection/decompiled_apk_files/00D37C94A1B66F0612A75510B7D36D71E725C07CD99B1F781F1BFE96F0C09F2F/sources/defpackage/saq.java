package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: saq  reason: default package */
/* loaded from: classes4.dex */
public final class saq extends View.AccessibilityDelegate {
    public final sai b;
    public final AccessibilityManager e;
    public final AccessibilityManager.AccessibilityStateChangeListener f;
    public final float g;
    public sap h;
    public final Set i;
    public String j;
    public int k;
    public final Rect l;
    public final Rect m;
    private final View.OnHoverListener o;
    private boolean p;
    private boolean q;
    private final sbs r;
    private final shp s;
    public final Runnable a = new saj(this);
    private List n = sbv.d();
    public List c = sbv.d();
    public final long d = 5000;

    public saq(sai saiVar) {
        sao saoVar = new sao(this);
        this.f = saoVar;
        this.r = new sal(this);
        this.s = new san(this);
        this.o = new sam(this);
        this.h = sap.NONE;
        this.i = EnumSet.of(sap.NONE);
        this.j = "";
        this.k = -1;
        this.l = new Rect();
        this.m = new Rect();
        this.b = saiVar;
        this.g = scf.b(saiVar.getContext(), 1.0f);
        AccessibilityManager accessibilityManager = (AccessibilityManager) saiVar.getContext().getSystemService("accessibility");
        this.e = accessibilityManager;
        accessibilityManager.addAccessibilityStateChangeListener(saoVar);
        if (accessibilityManager.isEnabled()) {
            d();
        }
    }

    public static final int f(int i, int i2) {
        return (i << 24) | i2;
    }

    public final void a(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(i);
        obtain.setEnabled(true);
        obtain.setClassName(this.b.getClass().getName());
        obtain.setPackageName(this.b.getContext().getPackageName());
        obtain.setSource(this.b, i2);
        this.b.getParent().requestSendAccessibilityEvent(this.b, obtain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        sai saiVar = this.b;
        HashSet c = shp.c();
        if (saiVar.p) {
            c.add(saiVar.q);
            c.add(saiVar.r);
        }
        for (int i = 0; i < saiVar.getChildCount(); i++) {
            View childAt = saiVar.getChildAt(i);
            if (childAt instanceof saw) {
                c.add((saw) childAt);
            } else if (childAt.getContentDescription() != null && !childAt.getContentDescription().equals("")) {
                c.add(new sbd(childAt));
            }
        }
        for (sbw sbwVar : saiVar.s.values()) {
            if (sbwVar instanceof saw) {
                c.add((saw) sbwVar);
            }
        }
        ArrayList e = sbv.e(c);
        this.n = e;
        Collections.sort(e, wd.b);
        sai saiVar2 = this.b;
        LinkedHashSet f = shp.f();
        for (int childCount = saiVar2.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt2 = saiVar2.getChildAt(childCount);
            if (childAt2 instanceof sbc) {
                f.add((sbc) childAt2);
            }
        }
        for (sbw sbwVar2 : saiVar2.s.values()) {
            if (sbwVar2 instanceof sbc) {
                f.add((sbc) sbwVar2);
            }
        }
        this.c = sbv.e(f);
        this.i.clear();
        if (!this.n.isEmpty()) {
            this.i.add(sap.DESCRIBE);
        }
        int i2 = 0;
        for (sbc sbcVar : this.c) {
            i2 += sbcVar.a().size();
        }
        if (i2 > 0) {
            this.i.add(sap.EXPLORE);
        }
        if (this.i.isEmpty()) {
            this.i.add(sap.NONE);
        }
        if (!this.i.contains(this.h)) {
            sap sapVar = (sap) this.i.iterator().next();
            if (this.h == sap.EXPLORE) {
                this.k = -1;
            } else if (sapVar == sap.EXPLORE) {
                this.k = -2;
            }
            this.h = sapVar;
        }
        if (this.b.getContentDescription() != null) {
            this.j = this.b.getContentDescription().toString();
        } else if (this.i.contains(sap.DESCRIBE)) {
            this.j = sau.a(this.n);
            if (this.i.contains(sap.EXPLORE)) {
                String str = this.j;
                String string = this.b.getContext().getString(R.string.aplosExploreModeAvailableAnnouncement);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
                sb.append(str);
                sb.append(" ");
                sb.append(string);
                this.j = sb.toString();
            }
        } else {
            this.j = "";
        }
        sgo.a(this.b);
        System.currentTimeMillis();
        this.l.set(0, 0, this.b.getWidth(), this.b.getHeight());
        int[] iArr = new int[2];
        this.b.getLocationInWindow(iArr);
        this.m.set(this.l);
        this.m.offset(iArr[0], iArr[1]);
        sau.b(this.b);
    }

    public final void c() {
        this.b.setFocusable(this.p);
        this.b.setFocusableInTouchMode(this.q);
        this.b.z(this.r);
        sai saiVar = this.b;
        saiVar.m.b.remove(this.s);
        this.b.setOnHoverListener(null);
    }

    public final void d() {
        this.p = this.b.isFocusable();
        this.q = this.b.isFocusableInTouchMode();
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.y(this.r);
        this.b.A(this.s);
        this.b.setOnHoverListener(this.o);
    }

    public final void e(sap sapVar) {
        if (this.h == sapVar) {
            return;
        }
        this.h = sapVar;
        sau.b(this.b);
        sap sapVar2 = sap.DESCRIBE;
        int ordinal = sapVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.k = -2;
                a(32768, -2);
                return;
            } else if (ordinal != 2) {
                return;
            }
        }
        this.k = -1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return new sak(this);
    }
}
