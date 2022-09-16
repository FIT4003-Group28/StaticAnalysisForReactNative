package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
/* compiled from: PG */
/* renamed from: afqx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afqx implements View.OnClickListener {
    public final /* synthetic */ LocationSearchView a;
    private final /* synthetic */ int b;

    public /* synthetic */ afqx(LocationSearchView locationSearchView) {
        this.a = locationSearchView;
    }

    public /* synthetic */ afqx(LocationSearchView locationSearchView, int i) {
        this.b = i;
        this.a = locationSearchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.a.setText("");
            return;
        }
        LocationSearchView locationSearchView = this.a;
        locationSearchView.b(true);
        afqv afqvVar = locationSearchView.e;
        if (afqvVar == null) {
            return;
        }
        afqvVar.b.d();
    }
}
