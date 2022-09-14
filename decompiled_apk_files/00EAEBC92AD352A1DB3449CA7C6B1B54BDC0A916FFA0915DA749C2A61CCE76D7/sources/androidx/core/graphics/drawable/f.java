package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f1585a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f1586b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f1587c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f1588d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f1587c = null;
        this.f1588d = d.f1578h;
        if (fVar != null) {
            this.f1585a = fVar.f1585a;
            this.f1586b = fVar.f1586b;
            this.f1587c = fVar.f1587c;
            this.f1588d = fVar.f1588d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f1586b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f1585a;
        Drawable.ConstantState constantState = this.f1586b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
