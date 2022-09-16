package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ija  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ija implements View.OnClickListener {
    private final /* synthetic */ int j;
    public static final /* synthetic */ ija i = new ija(12);
    public static final /* synthetic */ ija h = new ija(11);
    public static final /* synthetic */ ija g = new ija(10);
    public static final /* synthetic */ ija f = new ija(8);
    public static final /* synthetic */ ija e = new ija(7);
    public static final /* synthetic */ ija d = new ija(6);
    public static final /* synthetic */ ija c = new ija(5);
    public static final /* synthetic */ ija b = new ija(4);
    public static final /* synthetic */ ija a = new ija(3);

    public /* synthetic */ ija() {
    }

    public ija(int i2) {
        this.j = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.j) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                long j = kjv.a;
                return;
            case 8:
                long j2 = kjv.a;
                return;
            case 9:
            case 10:
            case 11:
                return;
            default:
                umr.a(view);
                return;
        }
    }
}
