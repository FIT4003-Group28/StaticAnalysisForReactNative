package android.support.b.a;

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
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class c extends h implements android.support.b.a.b {

    /* renamed from: a  reason: collision with root package name */
    final Drawable.Callback f109a;

    /* renamed from: c  reason: collision with root package name */
    private a f110c;

    /* renamed from: d  reason: collision with root package name */
    private Context f111d;
    private ArgbEvaluator e;
    private Animator.AnimatorListener f;
    private ArrayList<Object> g;

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    c() {
        this(null, null, null);
    }

    private c(Context context) {
        this(context, null, null);
    }

    private c(Context context, a aVar, Resources resources) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.f109a = new Drawable.Callback() { // from class: android.support.b.a.c.1
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
        };
        this.f111d = context;
        if (aVar != null) {
            this.f110c = aVar;
        } else {
            this.f110c = new a(context, aVar, this.f109a, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f122b != null) {
            this.f122b.mutate();
        }
        return this;
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f122b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(this.f122b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.f122b != null) {
            return this.f122b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f110c.f113a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f122b != null) {
            this.f122b.draw(canvas);
            return;
        }
        this.f110c.f114b.draw(canvas);
        if (!this.f110c.f115c.isStarted()) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f122b != null) {
            this.f122b.setBounds(rect);
        } else {
            this.f110c.f114b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f122b != null) {
            return this.f122b.setState(iArr);
        }
        return this.f110c.f114b.setState(iArr);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f122b != null) {
            return this.f122b.setLevel(i);
        }
        return this.f110c.f114b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.f122b != null) {
            return android.support.v4.b.a.a.c(this.f122b);
        }
        return this.f110c.f114b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f122b != null) {
            this.f122b.setAlpha(i);
        } else {
            this.f110c.f114b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f122b != null) {
            this.f122b.setColorFilter(colorFilter);
        } else {
            this.f110c.f114b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTint(int i) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, i);
        } else {
            this.f110c.f114b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, colorStateList);
        } else {
            this.f110c.f114b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, mode);
        } else {
            this.f110c.f114b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f122b != null) {
            return this.f122b.setVisible(z, z2);
        }
        this.f110c.f114b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.f122b != null) {
            return this.f122b.isStateful();
        }
        return this.f110c.f114b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f122b != null) {
            return this.f122b.getOpacity();
        }
        return this.f110c.f114b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f122b != null) {
            return this.f122b.getIntrinsicWidth();
        }
        return this.f110c.f114b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f122b != null) {
            return this.f122b.getIntrinsicHeight();
        }
        return this.f110c.f114b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f122b != null) {
            return android.support.v4.b.a.a.b(this.f122b);
        }
        return this.f110c.f114b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, z);
        } else {
            this.f110c.f114b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.e);
                    int resourceId = a2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i a3 = i.a(resources, resourceId, theme);
                        a3.a(false);
                        a3.setCallback(this.f109a);
                        if (this.f110c.f114b != null) {
                            this.f110c.f114b.setCallback(null);
                        }
                        this.f110c.f114b = a3;
                    }
                    a2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, android.support.b.a.a.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f111d != null) {
                            a(string, e.a(this.f111d, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f110c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f122b != null) {
            return android.support.v4.b.a.a.d(this.f122b);
        }
        return false;
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f117a;

        public b(Drawable.ConstantState constantState) {
            this.f117a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            cVar.f122b = this.f117a.newDrawable();
            cVar.f122b.setCallback(cVar.f109a);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            cVar.f122b = this.f117a.newDrawable(resources);
            cVar.f122b.setCallback(cVar.f109a);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            cVar.f122b = this.f117a.newDrawable(resources, theme);
            cVar.f122b.setCallback(cVar.f109a);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f117a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f117a.getChangingConfigurations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f113a;

        /* renamed from: b  reason: collision with root package name */
        i f114b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f115c;

        /* renamed from: d  reason: collision with root package name */
        android.support.v4.i.a<Animator, String> f116d;
        private ArrayList<Animator> e;

        public a(Context context, a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f113a = aVar.f113a;
                if (aVar.f114b != null) {
                    Drawable.ConstantState constantState = aVar.f114b.getConstantState();
                    if (resources != null) {
                        this.f114b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f114b = (i) constantState.newDrawable();
                    }
                    this.f114b = (i) this.f114b.mutate();
                    this.f114b.setCallback(callback);
                    this.f114b.setBounds(aVar.f114b.getBounds());
                    this.f114b.a(false);
                }
                if (aVar.e == null) {
                    return;
                }
                int size = aVar.e.size();
                this.e = new ArrayList<>(size);
                this.f116d = new android.support.v4.i.a<>(size);
                for (int i = 0; i < size; i++) {
                    Animator animator = aVar.e.get(i);
                    Animator clone = animator.clone();
                    String str = aVar.f116d.get(animator);
                    clone.setTarget(this.f114b.a(str));
                    this.e.add(clone);
                    this.f116d.put(clone, str);
                }
                a();
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f113a;
        }

        public void a() {
            if (this.f115c == null) {
                this.f115c = new AnimatorSet();
            }
            this.f115c.playTogether(this.e);
        }
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
            if (this.e == null) {
                this.e = new ArgbEvaluator();
            }
            objectAnimator.setEvaluator(this.e);
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.f110c.f114b.a(str));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        if (this.f110c.e == null) {
            this.f110c.e = new ArrayList();
            this.f110c.f116d = new android.support.v4.i.a<>();
        }
        this.f110c.e.add(animator);
        this.f110c.f116d.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.f122b != null) {
            return ((AnimatedVectorDrawable) this.f122b).isRunning();
        }
        return this.f110c.f115c.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f122b != null) {
            ((AnimatedVectorDrawable) this.f122b).start();
        } else if (this.f110c.f115c.isStarted()) {
        } else {
            this.f110c.f115c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f122b != null) {
            ((AnimatedVectorDrawable) this.f122b).stop();
        } else {
            this.f110c.f115c.end();
        }
    }
}
