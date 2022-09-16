package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vez  reason: default package */
/* loaded from: classes4.dex */
public class vez implements vex {
    public String c;
    public ColorStateList d = null;
    public Drawable e = null;
    public Drawable f = null;

    public vez(String str) {
        this.c = str;
    }

    @Override // defpackage.vex
    public int b() {
        return R.layout.bottom_sheet_list_item;
    }

    @Override // defpackage.vex
    public boolean e() {
        return true;
    }

    public final void f(int i) {
        this.d = ColorStateList.valueOf(i);
    }
}
