package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: tax  reason: default package */
/* loaded from: classes4.dex */
public final class tax {
    public final AccessibilityManager a;
    public final taw b;
    public final taq c;
    public DisplayMetrics d;
    private final Context e;

    public tax(Context context, taq taqVar) {
        this.e = context;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        accessibilityManager.getClass();
        this.a = accessibilityManager;
        this.b = new taw(accessibilityManager);
        this.d = context.getResources().getDisplayMetrics();
        this.c = taqVar;
    }

    public static int a(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public final ayoi b(final tda tdaVar) {
        azev azevVar = new azev(ayoi.w(new ayoj() { // from class: tau
            @Override // defpackage.ayoj
            public final void a(final azeh azehVar) {
                final tax taxVar = tax.this;
                tda tdaVar2 = tdaVar;
                final View view = tdaVar2.b;
                Integer num = tdaVar2.c;
                int i = 0;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = tdaVar2.d;
                if (num2 != null) {
                    i = num2.intValue();
                }
                final int a = tax.a(taxVar.d, intValue);
                final int a2 = tax.a(taxVar.d, i);
                final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: tar
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        azehVar.a(tax.this.c(view, a, a2));
                    }
                };
                final tat tatVar = new tat(taxVar, azehVar, view, a, a2);
                final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: tas
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        tax taxVar2 = tax.this;
                        azeh azehVar2 = azehVar;
                        View view2 = view;
                        int i2 = a;
                        int i3 = a2;
                        taxVar2.b.b();
                        azehVar2.a(taxVar2.c(view2, i2, i3));
                    }
                };
                taxVar.a.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                if (view != null) {
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                taxVar.c.b(tatVar);
                azehVar.f(new ayqa() { // from class: tav
                    @Override // defpackage.ayqa
                    public final void a() {
                        tax taxVar2 = tax.this;
                        View view2 = view;
                        View.OnLayoutChangeListener onLayoutChangeListener2 = onLayoutChangeListener;
                        tat tatVar2 = tatVar;
                        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = touchExplorationStateChangeListener;
                        if (view2 != null) {
                            view2.removeOnLayoutChangeListener(onLayoutChangeListener2);
                        }
                        taxVar2.c.c(tatVar2);
                        taxVar2.a.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
                    }
                });
                azehVar.a(taxVar.c(view, a, a2));
            }
        }), ayrc.a);
        azqc.i();
        return azevVar;
    }

    public final byte[] c(View view, int i, int i2) {
        return d(view, 0, null, i, i2);
    }

    public final byte[] d(View view, int i, Context context, int i2, int i3) {
        if (view != null) {
            i2 = a(this.d, view.getWidth());
            i3 = a(this.d, view.getHeight());
        }
        if (context != null) {
            this.d = context.getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = this.d;
        int a = a(displayMetrics, displayMetrics.widthPixels);
        DisplayMetrics displayMetrics2 = this.d;
        int a2 = a(displayMetrics2, displayMetrics2.heightPixels);
        int i4 = 2;
        if (i == 0) {
            i = (a == 0 || a2 == 0) ? 1 : a2 > a ? 4 : 2;
        }
        aopa createBuilder = awno.a.createBuilder();
        createBuilder.copyOnWrite();
        awno awnoVar = (awno) createBuilder.instance;
        awnoVar.g = 0;
        awnoVar.b |= 16;
        createBuilder.copyOnWrite();
        awno awnoVar2 = (awno) createBuilder.instance;
        awnoVar2.b |= 1;
        awnoVar2.c = i2;
        createBuilder.copyOnWrite();
        awno awnoVar3 = (awno) createBuilder.instance;
        awnoVar3.b |= 2;
        awnoVar3.d = i3;
        aopa createBuilder2 = awnj.a.createBuilder();
        createBuilder2.copyOnWrite();
        awnj awnjVar = (awnj) createBuilder2.instance;
        awnjVar.c = i - 1;
        awnjVar.b |= 1;
        awnj awnjVar2 = (awnj) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        awno awnoVar4 = (awno) createBuilder.instance;
        awnjVar2.getClass();
        awnoVar4.e = awnjVar2;
        awnoVar4.b |= 4;
        aopa createBuilder3 = awoq.a.createBuilder();
        createBuilder3.copyOnWrite();
        awoq awoqVar = (awoq) createBuilder3.instance;
        awoqVar.b |= 1;
        awoqVar.c = a;
        createBuilder3.copyOnWrite();
        awoq awoqVar2 = (awoq) createBuilder3.instance;
        awoqVar2.b |= 2;
        awoqVar2.d = a2;
        awoq awoqVar3 = (awoq) createBuilder3.mo39build();
        createBuilder.copyOnWrite();
        awno awnoVar5 = (awno) createBuilder.instance;
        awoqVar3.getClass();
        awnoVar5.f = awoqVar3;
        awnoVar5.b |= 8;
        if (this.e.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600) {
            i4 = 1;
        }
        createBuilder.copyOnWrite();
        awno awnoVar6 = (awno) createBuilder.instance;
        awnoVar6.h = i4 - 1;
        awnoVar6.b |= 32;
        Boolean a3 = this.b.a();
        if (a3 != null) {
            boolean booleanValue = a3.booleanValue();
            createBuilder.copyOnWrite();
            awno awnoVar7 = (awno) createBuilder.instance;
            awnoVar7.b |= 64;
            awnoVar7.i = booleanValue;
        }
        return ((awno) createBuilder.mo39build()).toByteArray();
    }
}
