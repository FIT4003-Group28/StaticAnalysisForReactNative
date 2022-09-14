package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.u;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class a extends u {
    private static int j = 128;

    /* renamed from: c  reason: collision with root package name */
    private double f9794c;

    /* renamed from: d  reason: collision with root package name */
    private double f9795d;

    /* renamed from: e  reason: collision with root package name */
    private double f9796e;

    /* renamed from: f  reason: collision with root package name */
    private double f9797f;

    /* renamed from: g  reason: collision with root package name */
    private double f9798g;

    /* renamed from: h  reason: collision with root package name */
    private String f9799h;
    private List<String> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.slider.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0196a extends TimerTask {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f9800b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AccessibilityEvent f9801c;

        C0196a(a aVar, AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            this.f9800b = accessibilityManager;
            this.f9801c = accessibilityEvent;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f9800b.sendAccessibilityEvent(this.f9801c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Callable<BitmapDrawable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9802a;

        b(String str) {
            this.f9802a = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public BitmapDrawable mo302call() {
            Bitmap decodeStream;
            try {
                if (!this.f9802a.startsWith("http://") && !this.f9802a.startsWith("https://") && !this.f9802a.startsWith("file://") && !this.f9802a.startsWith("asset://") && !this.f9802a.startsWith("data:")) {
                    decodeStream = BitmapFactory.decodeResource(a.this.getResources(), a.this.getResources().getIdentifier(this.f9802a, "drawable", a.this.getContext().getPackageName()));
                    return new BitmapDrawable(a.this.getResources(), decodeStream);
                }
                decodeStream = BitmapFactory.decodeStream(new URL(this.f9802a).openStream());
                return new BitmapDrawable(a.this.getResources(), decodeStream);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9794c = 0.0d;
        this.f9795d = 0.0d;
        this.f9796e = 0.0d;
        this.f9797f = 0.0d;
        this.f9798g = 0.0d;
        a();
    }

    private BitmapDrawable a(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new b(str)).get();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    private void b() {
        List<String> list;
        if (this.f9799h == null || (list = this.i) == null || list.size() - 1 != ((int) this.f9795d)) {
            return;
        }
        String str = this.i.get((int) this.f9796e);
        int length = this.f9799h.length();
        String str2 = this.f9799h;
        if (str != null && Integer.parseInt(str) == 1) {
            str2 = str2.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, str2));
    }

    private void c() {
        if (this.f9797f == 0.0d) {
            this.f9798g = (this.f9795d - this.f9794c) / j;
        }
        setMax(getTotalSteps());
        d();
    }

    private void d() {
        double d2 = this.f9796e;
        double d3 = this.f9794c;
        setProgress((int) Math.round(((d2 - d3) / (this.f9795d - d3)) * getTotalSteps()));
    }

    private double getStepValue() {
        double d2 = this.f9797f;
        return d2 > 0.0d ? d2 : this.f9798g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f9795d - this.f9794c) / getStepValue());
    }

    public double a(int i) {
        return i == getMax() ? this.f9795d : (i * getStepValue()) + this.f9794c;
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(a.class.getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new C0196a(this, accessibilityManager, obtain), 1000L);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityIncrements(List<String> list) {
        this.i = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityUnits(String str) {
        this.f9799h = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d2) {
        this.f9795d = d2;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d2) {
        this.f9794c = d2;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d2) {
        this.f9797f = d2;
        c();
    }

    public void setThumbImage(String str) {
        if (str == null) {
            setThumb(getThumb());
            return;
        }
        setThumb(a(str));
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        setSplitTrack(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d2) {
        this.f9796e = d2;
        d();
    }
}
