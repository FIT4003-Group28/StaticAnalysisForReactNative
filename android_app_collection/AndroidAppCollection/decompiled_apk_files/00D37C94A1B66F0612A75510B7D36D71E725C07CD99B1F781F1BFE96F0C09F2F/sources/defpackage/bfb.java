package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.OverlayListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfb  reason: default package */
/* loaded from: classes2.dex */
public final class bfb implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ bfl b;

    public bfb(bfl bflVar, boolean z) {
        this.b = bflVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        this.b.i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        bfl bflVar = this.b;
        if (bflVar.P) {
            bflVar.Q = true;
            return;
        }
        boolean z = this.a;
        int g = bfl.g(bflVar.l);
        bfl.n(bflVar.l, -1);
        bflVar.s(bflVar.t());
        View decorView = bflVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(bflVar.getWindow().getAttributes().width, 1073741824), 0);
        bfl.n(bflVar.l, g);
        if (bflVar.f != null || !(bflVar.j.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) bflVar.j.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = bflVar.f(bitmap.getWidth(), bitmap.getHeight());
            bflVar.j.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int h = bflVar.h(bflVar.t());
        int size = bflVar.q.size();
        int size2 = bflVar.d.k() ? bflVar.y * bflVar.d.d().size() : 0;
        if (size > 0) {
            size2 += bflVar.A;
        }
        int min = Math.min(size2, bflVar.z);
        if (true != bflVar.O) {
            min = 0;
        }
        int max = Math.max(i, min) + h;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (bflVar.h.getMeasuredHeight() - bflVar.i.getMeasuredHeight());
        if (bflVar.f != null || i <= 0 || max > height) {
            if (bfl.g(bflVar.o) + bflVar.l.getMeasuredHeight() >= bflVar.i.getMeasuredHeight()) {
                bflVar.j.setVisibility(8);
            }
            max = min + h;
            i = 0;
        } else {
            bflVar.j.setVisibility(0);
            bfl.n(bflVar.j, i);
        }
        if (!bflVar.t() || max > height) {
            bflVar.m.setVisibility(8);
        } else {
            bflVar.m.setVisibility(0);
        }
        bflVar.s(bflVar.m.getVisibility() == 0);
        int h2 = bflVar.h(bflVar.m.getVisibility() == 0);
        int max2 = Math.max(i, min) + h2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        bflVar.l.clearAnimation();
        bflVar.o.clearAnimation();
        bflVar.i.clearAnimation();
        if (z) {
            bflVar.i(bflVar.l, h2);
            bflVar.i(bflVar.o, min);
            bflVar.i(bflVar.i, height);
        } else {
            bfl.n(bflVar.l, h2);
            bfl.n(bflVar.o, min);
            bfl.n(bflVar.i, height);
        }
        bfl.n(bflVar.g, rect.height());
        List d = bflVar.d.d();
        if (d.isEmpty()) {
            bflVar.q.clear();
            bflVar.p.notifyDataSetChanged();
        } else if (new HashSet(bflVar.q).equals(new HashSet(d))) {
            bflVar.p.notifyDataSetChanged();
        } else {
            if (z) {
                OverlayListView overlayListView = bflVar.o;
                bfk bfkVar = bflVar.p;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                    Object item = bfkVar.getItem(firstVisiblePosition + i2);
                    View childAt = overlayListView.getChildAt(i2);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                Context context = bflVar.e;
                OverlayListView overlayListView2 = bflVar.o;
                bfk bfkVar2 = bflVar.p;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                    Object item2 = bfkVar2.getItem(firstVisiblePosition2 + i3);
                    View childAt2 = overlayListView2.getChildAt(i3);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            List list = bflVar.q;
            HashSet hashSet = new HashSet(d);
            hashSet.removeAll(list);
            bflVar.r = hashSet;
            HashSet hashSet2 = new HashSet(bflVar.q);
            hashSet2.removeAll(d);
            bflVar.s = hashSet2;
            bflVar.q.addAll(0, bflVar.r);
            bflVar.q.removeAll(bflVar.s);
            bflVar.p.notifyDataSetChanged();
            if (!z || !bflVar.O || bflVar.r.size() + bflVar.s.size() <= 0) {
                bflVar.r = null;
                bflVar.s = null;
                return;
            }
            bflVar.o.setEnabled(false);
            bflVar.o.requestLayout();
            bflVar.P = true;
            bflVar.o.getViewTreeObserver().addOnGlobalLayoutListener(new bfd(bflVar, hashMap, hashMap2));
        }
    }
}
