package defpackage;

import android.net.Uri;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import java.util.List;
/* compiled from: PG */
/* renamed from: cduy  reason: default package */
/* loaded from: classes4.dex */
public final class cduy extends tj<cduu, cdve> {
    public static final List<cdvd> f;
    private static final cdvd j;
    public List<? extends cduu> e;
    private final cebd g;
    private final ilo h;
    private final dzve<Uri, dztc> i;

    static {
        cdvd cdvdVar = new cdvd();
        j = cdvdVar;
        f = dzti.a(cdvdVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cduy(cebd cebdVar, ilo iloVar, dzve<? super Uri, dztc> dzveVar) {
        super(new cdux());
        dzvx.c(cebdVar, "logger");
        this.g = cebdVar;
        this.h = iloVar;
        this.i = dzveVar;
        this.e = f;
        j(true);
        a(this.e);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ acl d(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Unknown view type".toString());
            }
            return new ceaz(viewGroup);
        }
        return new cdvc(viewGroup, this.g, this.h, this.i);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(acl aclVar, int i) {
        cdve cdveVar = (cdve) aclVar;
        dzvx.c(cdveVar, "holder");
        cduu b = b(i);
        dzvx.b(b, "getItem(index)");
        cdveVar.D(b);
    }

    @Override // defpackage.abg
    public final int i(int i) {
        cduu b = b(i);
        if (b instanceof cduz) {
            return 0;
        }
        if (!(b instanceof cdvd)) {
            throw new dzsw();
        }
        return 1;
    }

    @Override // defpackage.abg
    public final long k(int i) {
        return b(i).a();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void m(acl aclVar) {
        cdve cdveVar = (cdve) aclVar;
        if (cdveVar instanceof cdvc) {
            cdvc cdvcVar = (cdvc) cdveVar;
            WebImageView webImageView = cdvcVar.s;
            dzvx.b(webImageView, "image");
            cdvcVar.C(webImageView);
        }
    }
}
