package a.s.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class c extends h implements a.s.a.a.b {

    /* renamed from: c  reason: collision with root package name */
    private b f739c;

    /* renamed from: d  reason: collision with root package name */
    private Context f740d;

    /* renamed from: e  reason: collision with root package name */
    private ArgbEvaluator f741e;

    /* renamed from: f  reason: collision with root package name */
    final Drawable.Callback f742f;

    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f744a;

        /* renamed from: b  reason: collision with root package name */
        i f745b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f746c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f747d;

        /* renamed from: e  reason: collision with root package name */
        a.e.a<Animator, String> f748e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f744a = bVar.f744a;
                i iVar = bVar.f745b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f745b = (i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    i iVar2 = this.f745b;
                    iVar2.mutate();
                    this.f745b = iVar2;
                    this.f745b.setCallback(callback);
                    this.f745b.setBounds(bVar.f745b.getBounds());
                    this.f745b.a(false);
                }
                ArrayList<Animator> arrayList = bVar.f747d;
                if (arrayList == null) {
                    return;
                }
                int size = arrayList.size();
                this.f747d = new ArrayList<>(size);
                this.f748e = new a.e.a<>(size);
                for (int i = 0; i < size; i++) {
                    Animator animator = bVar.f747d.get(i);
                    Animator clone = animator.clone();
                    String str = bVar.f748e.get(animator);
                    clone.setTarget(this.f745b.a(str));
                    this.f747d.add(clone);
                    this.f748e.put(clone, str);
                }
                a();
            }
        }

        public void a() {
            if (this.f746c == null) {
                this.f746c = new AnimatorSet();
            }
            this.f746c.playTogether(this.f747d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f744a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: a.s.a.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0037c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f749a;

        public C0037c(Drawable.ConstantState constantState) {
            this.f749a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f749a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f749a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            cVar.f754b = this.f749a.newDrawable();
            cVar.f754b.setCallback(cVar.f742f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            cVar.f754b = this.f749a.newDrawable(resources);
            cVar.f754b.setCallback(cVar.f742f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            cVar.f754b = this.f749a.newDrawable(resources, theme);
            cVar.f754b.setCallback(cVar.f742f);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(Context context) {
        this(context, null, null);
    }

    private c(Context context, b bVar, Resources resources) {
        this.f741e = null;
        this.f742f = new a();
        this.f740d = context;
        if (bVar != null) {
            this.f739c = bVar;
        } else {
            this.f739c = new b(context, bVar, this.f742f, resources);
        }
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if (!"fillColor".equals(propertyName) && !"strokeColor".equals(propertyName)) {
                return;
            }
            if (this.f741e == null) {
                this.f741e = new ArgbEvaluator();
            }
            objectAnimator.setEvaluator(this.f741e);
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.f739c.f745b.a(str));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        b bVar = this.f739c;
        if (bVar.f747d == null) {
            bVar.f747d = new ArrayList<>();
            this.f739c.f748e = new a.e.a<>();
        }
        this.f739c.f747d.add(animator);
        this.f739c.f748e.put(animator, str);
    }

    @Override // a.s.a.a.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.a(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f739c.f745b.draw(canvas);
        if (!this.f739c.f746c.isStarted()) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f754b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f739c.f745b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f739c.f744a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f754b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f739c.f745b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f754b;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0037c(drawable.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f739c.f745b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f739c.f745b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.getOpacity() : this.f739c.f745b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = a.g.e.f.g.a(resources, theme, attributeSet, a.s.a.a.a.f735e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i a2 = i.a(resources, resourceId, theme);
                        a2.a(false);
                        a2.setCallback(this.f742f);
                        i iVar = this.f739c.f745b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f739c.f745b = a2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.s.a.a.a.f736f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f740d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        a(string, e.a(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f739c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f754b;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f739c.f745b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f754b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f739c.f746c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.isStateful() : this.f739c.f745b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f739c.f745b.setBounds(rect);
        }
    }

    @Override // a.s.a.a.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.setLevel(i) : this.f739c.f745b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.setState(iArr) : this.f739c.f745b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f739c.f745b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f739c.f745b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f739c.f745b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i);
        } else {
            this.f739c.f745b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        } else {
            this.f739c.f745b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
        } else {
            this.f739c.f745b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f739c.f745b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f739c.f746c.isStarted()) {
        } else {
            this.f739c.f746c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f739c.f746c.end();
        }
    }
}
