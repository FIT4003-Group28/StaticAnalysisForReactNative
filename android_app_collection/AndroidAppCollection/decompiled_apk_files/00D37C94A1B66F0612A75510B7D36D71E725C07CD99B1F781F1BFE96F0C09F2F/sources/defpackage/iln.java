package defpackage;

import android.view.MenuItem;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
/* compiled from: PG */
/* renamed from: iln  reason: default package */
/* loaded from: classes3.dex */
public final class iln {
    public final akbn a;
    public UploadActivity d;
    public String e;
    public boolean f = false;
    private boolean h = false;
    int g = 1;
    public final ilm b = new ilm(this);
    public final ili c = new ili(this);

    public iln(akbn akbnVar) {
        this.a = akbnVar;
    }

    public final void a() {
        if (!d()) {
            return;
        }
        UploadActivity uploadActivity = this.d;
        zag.h(uploadActivity);
        asfp asfpVar = uploadActivity.X;
        if (asfpVar == null || (asfpVar.b & 512) == 0) {
            uploadActivity.v();
            return;
        }
        apzg apzgVar = asfpVar.m;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) apzgVar.qm(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
        ilh ilhVar = uploadActivity.s;
        for (alfc alfcVar : ilhVar.D) {
            ilhVar.G.i(alfcVar.e(), avul.UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_INITIATED, alfcVar.h(), alfcVar.f());
        }
        uploadActivity.aa.b(false);
        uploadActivity.F();
        vyh vyhVar = uploadActivity.v;
        ikk ikkVar = new ikk(uploadActivity, 2);
        ikk ikkVar2 = new ikk(uploadActivity, 1);
        aatq a = vyhVar.b.a();
        a.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
        awle awleVar = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d;
        if (awleVar == null) {
            awleVar = awle.a;
        }
        a.v = awleVar;
        vyhVar.b.b(a, new vyg(vyhVar, ikkVar2, ikkVar));
    }

    public final void b(boolean z) {
        this.h = z;
        c();
    }

    final boolean d() {
        return this.h && this.f;
    }

    public final void e(int i) {
        this.g = i;
        this.d.getWindow().setSoftInputMode((i == 2 ? 16 : 32) | (this.d.getWindow().getAttributes().softInputMode & 15));
        c();
    }

    public final void c() {
        int i = this.g;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                this.b.a(false);
                this.c.a(true);
                ili iliVar = this.c;
                iliVar.b(d());
                String str = iliVar.b.e;
                if (str != null) {
                    iliVar.c.setText(str);
                    return;
                } else {
                    iliVar.c.setText(R.string.start_upload_button);
                    return;
                }
            }
            this.b.a(true);
            this.c.a(false);
            ilm ilmVar = this.b;
            boolean d = d();
            MenuItem menuItem = ilmVar.a;
            if (menuItem == null || ilmVar.c == null) {
                return;
            }
            menuItem.setEnabled(d);
            ilmVar.b(d);
            String str2 = ilmVar.b.e;
            if (str2 != null) {
                ilmVar.a.setTitle(str2);
                ilmVar.c.setText(ilmVar.b.e);
                return;
            }
            ilmVar.c.setText(R.string.start_upload_button);
            return;
        }
        throw null;
    }
}
