package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: etd  reason: default package */
/* loaded from: classes3.dex */
public final class etd implements fcm {
    static final String[] a = {".loadingWhatToWatchBrowse", ".offlineAccountBrowse", ".loadingAccountBrowse"};
    public final afvn b;
    public final snc c;
    public final Executor d;
    public final ess e;
    public final aaqp f;
    etb g;
    etb h;
    etb i;
    etb j;
    etb k;
    etb l;
    private final File m;

    public etd(Context context, afvn afvnVar, snc sncVar, Executor executor, ess essVar, esp espVar, aacu aacuVar, aaqp aaqpVar) {
        this.b = afvnVar;
        this.c = sncVar;
        this.d = executor;
        this.m = new File(context.getFilesDir(), "offline");
        this.e = essVar;
        this.f = aaqpVar;
        if (espVar.a()) {
            try {
                if (!((Boolean) aacuVar.b().get()).booleanValue()) {
                    return;
                }
                String[] strArr = a;
                for (int i = 0; i < 3; i++) {
                    f(strArr[i]).a();
                }
                e().d();
                d().d();
                m().d();
                c().d();
                b().d();
                a().d();
            } catch (InterruptedException | ExecutionException e) {
                afus.c(2, 18, "Failed to get the fail safe status", e);
            }
        }
    }

    private final synchronized etb m() {
        if (this.i == null) {
            this.i = new esx(this, f(".generatedSingleTabAccountBrowseResponse"));
        }
        return this.i;
    }

    public final synchronized etb a() {
        if (this.l == null) {
            this.l = new esv(this, f(".guide"));
        }
        return this.l;
    }

    public final synchronized etb b() {
        if (this.k == null) {
            this.k = new esz(this, f(".loadingLibraryBrowse"));
        }
        return this.k;
    }

    public final synchronized etb c() {
        if (this.j == null) {
            this.j = new esy(this, f(".offlineCloudSingleTabBrowse"));
        }
        return this.j;
    }

    public final synchronized etb d() {
        if (this.h == null) {
            this.h = new esw(this, f(".offlineLibraryBrowse"));
        }
        return this.h;
    }

    public final synchronized etb e() {
        if (this.g == null) {
            this.g = new esu(this, f(".settings"));
        }
        return this.g;
    }

    final etc f(String str) {
        return new etc(new File(this.m, str));
    }

    public final BrowseResponseModel g() {
        BrowseResponseModel browseResponseModel = (BrowseResponseModel) d().c();
        return browseResponseModel == null ? new BrowseResponseModel(this.e.a()) : browseResponseModel;
    }

    @Override // defpackage.fcm
    public final ankt h() {
        try {
            return anlz.q(Boolean.valueOf(i() != null && i().s));
        } catch (IOException e) {
            zep.d("Failed to fetch offline browse", e);
            return anlz.q(false);
        }
    }

    public final arlt i() {
        return (arlt) c().c();
    }

    public final void j(abcn abcnVar) {
        abcnVar.getClass();
        e().e(abcnVar);
    }

    @Override // defpackage.fcm
    public final boolean k() {
        try {
            return ((Boolean) h().get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e) {
            zep.d("Failed to set access to offline", e);
            return false;
        } catch (TimeoutException e2) {
            zep.d("Timed out getting access to offline", e2);
            return false;
        }
    }

    public final void l(arlt arltVar) {
        b().e(arltVar);
    }
}
