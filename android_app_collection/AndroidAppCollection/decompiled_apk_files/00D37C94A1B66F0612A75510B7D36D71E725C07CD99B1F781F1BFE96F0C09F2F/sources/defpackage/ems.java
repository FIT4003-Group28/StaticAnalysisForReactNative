package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ems  reason: default package */
/* loaded from: classes3.dex */
public class ems extends oa implements acth {
    private yzh Wu;
    public zah a;
    public fpg b;
    public taq c;
    public yvs d;
    public axnm e;
    public yiv f;
    private boolean h = false;

    private final void pq() {
        qrq ar = ((yip) antz.u(this, yip.class)).ar();
        int h = ar.h(this, 13000000);
        if (h != 0) {
            if (h == 1 || h == 2 || h == 3) {
                Dialog a = ar.a(this, h, 17, new emq(this, 1));
                a.setCanceledOnTouchOutside(false);
                a.show();
                return;
            }
            Dialog a2 = ar.a(this, h, 17, new emq(this));
            a2.setCanceledOnTouchOutside(false);
            a2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: emr
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ems.this.finish();
                }
            });
            a2.show();
        }
    }

    protected Dialog a(int i) {
        return null;
    }

    protected void h(gfs gfsVar) {
    }

    public void j() {
        throw null;
    }

    protected Dialog k(int i) {
        return null;
    }

    public void mA() {
        nj supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.C();
            supportActionBar.j(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final frw mC() {
        return (frw) this.e.get();
    }

    public final yzh mD() {
        if (this.Wu == null) {
            nj supportActionBar = getSupportActionBar();
            supportActionBar.getClass();
            this.Wu = new yzh(supportActionBar.b());
        }
        return this.Wu;
    }

    protected void mz() {
    }

    public acti oi() {
        throw null;
    }

    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f.b(i, i2, intent)) {
            return;
        }
        if (i != 17) {
            if ((i == 900 || i == 901) && i2 == -1) {
                Intent J2 = arey.J(this, intent);
                if (J2 != null) {
                    startActivityForResult(J2, 902);
                    return;
                }
                i2 = -1;
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        pq();
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.c.a(configuration, this);
        super.onConfigurationChanged(configuration);
        zah zahVar = this.a;
        if (zahVar != null) {
            zahVar.b();
        }
        mA();
        this.b.d();
    }

    @Override // android.app.Activity
    @Deprecated
    protected final Dialog onCreateDialog(int i) {
        return onCreateDialog(i, null);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        mC().f(menu, getMenuInflater(), mD());
        this.b.d();
        mz();
        return true;
    }

    @Override // defpackage.oa, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        mC().b(menu);
        return super.onMenuOpened(i, menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            j();
            return true;
        }
        return mC().e(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        supportInvalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onResume() {
        super.onResume();
        mA();
        zah zahVar = this.a;
        if (zahVar != null) {
            zahVar.b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onStart() {
        this.c.a(getResources().getConfiguration(), this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        zah zahVar = this.a;
        if (zahVar != null) {
            zahVar.b();
        }
        super.onUserInteraction();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        try {
            super.startActivity(intent);
        } catch (Exception e) {
            zag.q(this, R.string.error_processing_link, 0);
            afus.c(2, 2, "Failed to resolve intent", e);
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Override // android.app.Activity
    protected final Dialog onCreateDialog(int i, Bundle bundle) {
        if (isFinishing()) {
            return null;
        }
        return bundle != null ? k(i) : a(i);
    }

    @Override // defpackage.abp, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        try {
            super.startActivityForResult(intent, i, bundle);
        } catch (Exception e) {
            zag.q(this, R.string.error_processing_link, 0);
            afus.c(2, 2, "Failed to resolve intent", e);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(intent, bundle);
        } catch (Exception e) {
            zag.q(this, R.string.error_processing_link, 0);
            afus.c(2, 2, "Failed to resolve intent", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.h) {
            this.h = true;
            gfu I = ((gfv) antz.u(this, gfv.class)).I();
            gfs gfsVar = gfs.LIGHT;
            int ordinal = I.a().ordinal();
            if (ordinal == 0) {
                emn.D(this);
            } else if (ordinal == 1) {
                emn.E(true, this);
            }
            h(I.a());
        }
        pq();
        super.onCreate(bundle);
        this.d.a();
    }
}
