package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final i<?> f1689a;

    private g(i<?> iVar) {
        this.f1689a = iVar;
    }

    public static g a(i<?> iVar) {
        androidx.core.util.g.a(iVar, "callbacks == null");
        return new g(iVar);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1689a.f1694e.r().onCreateView(view, str, context, attributeSet);
    }

    public Fragment a(String str) {
        return this.f1689a.f1694e.c(str);
    }

    public void a() {
        this.f1689a.f1694e.d();
    }

    public void a(Configuration configuration) {
        this.f1689a.f1694e.a(configuration);
    }

    public void a(Parcelable parcelable) {
        i<?> iVar = this.f1689a;
        if (iVar instanceof androidx.lifecycle.v) {
            iVar.f1694e.a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void a(Menu menu) {
        this.f1689a.f1694e.a(menu);
    }

    public void a(Fragment fragment) {
        i<?> iVar = this.f1689a;
        iVar.f1694e.a(iVar, iVar, fragment);
    }

    public void a(boolean z) {
        this.f1689a.f1694e.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f1689a.f1694e.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.f1689a.f1694e.a(menuItem);
    }

    public void b() {
        this.f1689a.f1694e.e();
    }

    public void b(boolean z) {
        this.f1689a.f1694e.b(z);
    }

    public boolean b(Menu menu) {
        return this.f1689a.f1694e.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.f1689a.f1694e.b(menuItem);
    }

    public void c() {
        this.f1689a.f1694e.f();
    }

    public void d() {
        this.f1689a.f1694e.h();
    }

    public void e() {
        this.f1689a.f1694e.i();
    }

    public void f() {
        this.f1689a.f1694e.k();
    }

    public void g() {
        this.f1689a.f1694e.l();
    }

    public void h() {
        this.f1689a.f1694e.m();
    }

    public boolean i() {
        return this.f1689a.f1694e.c(true);
    }

    public l j() {
        return this.f1689a.f1694e;
    }

    public void k() {
        this.f1689a.f1694e.y();
    }

    public Parcelable l() {
        return this.f1689a.f1694e.A();
    }
}
