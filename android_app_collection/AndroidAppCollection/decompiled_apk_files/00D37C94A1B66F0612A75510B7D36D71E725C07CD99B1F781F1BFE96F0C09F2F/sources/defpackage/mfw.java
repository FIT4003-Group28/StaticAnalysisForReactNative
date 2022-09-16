package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mfw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mfw implements ajrt {
    public final /* synthetic */ mgk a;
    private final /* synthetic */ int b;

    public /* synthetic */ mfw(mgk mgkVar) {
        this.a = mgkVar;
    }

    public /* synthetic */ mfw(mgk mgkVar, int i) {
        this.b = i;
        this.a = mgkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        float f;
        int i2 = this.b;
        mgg mggVar = null;
        if (i2 == 0) {
            mgk mgkVar = this.a;
            if (mgkVar.f.size() > 1) {
                mggVar = mgkVar;
            }
            ajrsVar.f("carousel_auto_rotate_callback", mggVar);
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ajrsVar.f("active_item_indicator_width", Integer.valueOf(this.a.h.a()));
                    return;
                } else {
                    ajrsVar.f("overlapping_item_height", Integer.valueOf(this.a.b));
                    return;
                }
            }
            mgk mgkVar2 = this.a;
            if (mgkVar2.f.size() > 1) {
                mggVar = mgkVar2.j;
            }
            ajrsVar.f("carousel_scroll_listener", mggVar);
        } else {
            mgk mgkVar3 = this.a;
            if ((mgkVar3.o.b & 16) != 0) {
                boolean k = elk.k(mgkVar3.a.getResources().getConfiguration().orientation);
                boolean y = zew.y(mgkVar3.a);
                apqj apqjVar = mgkVar3.o.f;
                if (apqjVar == null) {
                    apqjVar = apqj.a;
                }
                if (k) {
                    f = y ? apqjVar.d : apqjVar.b;
                } else {
                    f = y ? apqjVar.e : apqjVar.c;
                }
            } else {
                f = 0.0f;
            }
            if (f <= 0.0f) {
                f = mgkVar3.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
            }
            ajrsVar.f("carousel_aspect_ratio", Float.valueOf(f));
        }
    }
}
