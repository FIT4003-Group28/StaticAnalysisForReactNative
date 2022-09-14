package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: awhf  reason: default package */
/* loaded from: classes3.dex */
public class awhf extends ViewGroup {
    @dzsi
    public View a;
    @dzsi
    public awhi b;
    private final awhh c;

    public awhf(Context context, awhh awhhVar) {
        super(context);
        dbsk.s(awhhVar);
        this.c = awhhVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.a;
        awhi awhiVar = this.b;
        if (view != null && awhiVar != null) {
            int i5 = i3 - i;
            view.measure(View.MeasureSpec.makeMeasureSpec(i5 - (awhiVar.a + awhiVar.b), 1073741824), View.MeasureSpec.makeMeasureSpec(awhiVar.a() - awhiVar.c, 1073741824));
            int i6 = i4 - i2;
            Rect rect = new Rect(awhiVar.a, i6 - awhiVar.a(), i5 - awhiVar.b, i6 - awhiVar.c);
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        this.c.a();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
