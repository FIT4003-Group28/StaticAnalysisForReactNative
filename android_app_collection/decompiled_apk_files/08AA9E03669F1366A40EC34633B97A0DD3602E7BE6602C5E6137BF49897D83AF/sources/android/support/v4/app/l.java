package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m<?> f240a;

    public static l a(m<?> mVar) {
        return new l(mVar);
    }

    private l(m<?> mVar) {
        this.f240a = mVar;
    }

    public n a() {
        return this.f240a.k();
    }

    public i a(String str) {
        return this.f240a.f244d.b(str);
    }

    public void a(i iVar) {
        this.f240a.f244d.a(this.f240a, this.f240a, iVar);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f240a.f244d.onCreateView(view, str, context, attributeSet);
    }

    public void b() {
        this.f240a.f244d.l();
    }

    public Parcelable c() {
        return this.f240a.f244d.k();
    }

    public void a(Parcelable parcelable, p pVar) {
        this.f240a.f244d.a(parcelable, pVar);
    }

    public p d() {
        return this.f240a.f244d.i();
    }

    public void e() {
        this.f240a.f244d.m();
    }

    public void f() {
        this.f240a.f244d.n();
    }

    public void g() {
        this.f240a.f244d.o();
    }

    public void h() {
        this.f240a.f244d.p();
    }

    public void i() {
        this.f240a.f244d.q();
    }

    public void j() {
        this.f240a.f244d.r();
    }

    public void k() {
        this.f240a.f244d.s();
    }

    public void l() {
        this.f240a.f244d.u();
    }

    public void a(boolean z) {
        this.f240a.f244d.a(z);
    }

    public void b(boolean z) {
        this.f240a.f244d.b(z);
    }

    public void a(Configuration configuration) {
        this.f240a.f244d.a(configuration);
    }

    public void m() {
        this.f240a.f244d.v();
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f240a.f244d.a(menu, menuInflater);
    }

    public boolean a(Menu menu) {
        return this.f240a.f244d.a(menu);
    }

    public boolean a(MenuItem menuItem) {
        return this.f240a.f244d.a(menuItem);
    }

    public boolean b(MenuItem menuItem) {
        return this.f240a.f244d.b(menuItem);
    }

    public void b(Menu menu) {
        this.f240a.f244d.b(menu);
    }

    public boolean n() {
        return this.f240a.f244d.f();
    }
}
