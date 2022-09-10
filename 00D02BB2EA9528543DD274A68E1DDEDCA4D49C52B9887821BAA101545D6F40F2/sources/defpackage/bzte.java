package defpackage;

import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: bzte  reason: default package */
/* loaded from: classes4.dex */
public final class bzte extends bzti {
    public eaol a;
    public akqq b;
    private Uri c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private dcdc<bztk> i;

    @Override // defpackage.bzti
    public final void b(List<bztk> list) {
        this.i = dcdc.r(list);
    }

    @Override // defpackage.bzti
    public final void c(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.bzti
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bzti
    public final void e(Uri uri) {
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new NullPointerException("Null photoUri");
    }

    @Override // defpackage.bzti
    public final void f(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.bzti
    public final void g(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bzti
    public final void h(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bzti
    public final bztl a() {
        String str = this.c == null ? " photoUri" : "";
        if (this.a == null) {
            str = str.concat(" photoTakenTime");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" isValidForPhotoTakenNotification");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" wasShownInPhotoTakenNotification");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" wasUploaded");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" isFaceDetected");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" wasDismissedInTodoList");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" imageLabels");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bztf(this.c, this.a, this.b, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i);
    }
}
