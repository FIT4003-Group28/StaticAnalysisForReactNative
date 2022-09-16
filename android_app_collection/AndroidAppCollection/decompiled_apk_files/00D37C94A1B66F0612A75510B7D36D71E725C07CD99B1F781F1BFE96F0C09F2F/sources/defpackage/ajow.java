package defpackage;

import android.net.Uri;
import java.io.File;
/* compiled from: PG */
/* renamed from: ajow  reason: default package */
/* loaded from: classes.dex */
public final class ajow implements afyf {
    private final ajox a;
    private final afyf b;

    public ajow(ajox ajoxVar, afyf afyfVar) {
        this.a = ajoxVar;
        this.b = afyfVar;
    }

    @Override // defpackage.afyf
    public final /* bridge */ /* synthetic */ void a(Object obj, yiw yiwVar) {
        Uri uri = (Uri) obj;
        String a = this.a.a(uri.toString());
        if (a != null) {
            uri = Uri.fromFile(new File(a));
        }
        this.b.a(uri, yiwVar);
    }
}
