package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: afqv  reason: default package */
/* loaded from: classes.dex */
public final class afqv {
    public final afqu a;
    public final afqs b;
    public final afqt c;
    private final acti d;
    private final afre e;

    public afqv(acti actiVar, afre afreVar, aawp aawpVar, afqu afquVar, afqs afqsVar) {
        this.d = actiVar;
        this.e = afreVar;
        this.a = afquVar;
        this.b = afqsVar;
        this.c = new afqt(aawpVar, afquVar);
        LocationSearchView locationSearchView = (LocationSearchView) afquVar;
        locationSearchView.e = this;
        locationSearchView.d.e = this;
    }

    public final void a() {
        final LocationSearchView locationSearchView = (LocationSearchView) this.a;
        if (!TextUtils.isEmpty(locationSearchView.a.getText())) {
            locationSearchView.a(Collections.emptyList());
            locationSearchView.a.setText("");
        }
        locationSearchView.b(false);
        locationSearchView.a.requestFocus();
        locationSearchView.a.postDelayed(new Runnable() { // from class: afqz
            @Override // java.lang.Runnable
            public final void run() {
                zag.p(LocationSearchView.this.a);
            }
        }, 100L);
        this.e.b(new afrd() { // from class: afqr
            @Override // defpackage.afrd
            public final void a(asvk asvkVar) {
                afqv afqvVar = afqv.this;
                if (asvkVar != null) {
                    afqt afqtVar = afqvVar.c;
                    afqtVar.a = asvkVar;
                    afqtVar.filter(((LocationSearchView) afqvVar.a).a.getText());
                }
            }
        });
        this.d.d(acuo.a(39553), null, null);
    }
}
