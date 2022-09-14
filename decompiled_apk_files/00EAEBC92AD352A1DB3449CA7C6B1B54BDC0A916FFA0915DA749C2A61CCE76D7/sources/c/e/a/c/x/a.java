package c.e.a.c.x;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f4784a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0104a f4785b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4786c;

    /* renamed from: c.e.a.c.x.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0104a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0104a interfaceC0104a, Typeface typeface) {
        this.f4784a = typeface;
        this.f4785b = interfaceC0104a;
    }

    private void a(Typeface typeface) {
        if (!this.f4786c) {
            this.f4785b.a(typeface);
        }
    }

    public void a() {
        this.f4786c = true;
    }

    @Override // c.e.a.c.x.f
    public void a(int i) {
        a(this.f4784a);
    }

    @Override // c.e.a.c.x.f
    public void a(Typeface typeface, boolean z) {
        a(typeface);
    }
}
