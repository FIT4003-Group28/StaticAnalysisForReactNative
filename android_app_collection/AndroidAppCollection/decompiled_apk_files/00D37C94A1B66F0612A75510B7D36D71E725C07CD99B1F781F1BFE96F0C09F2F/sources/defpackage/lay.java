package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lay  reason: default package */
/* loaded from: classes3.dex */
public final class lay {
    public final Executor a;
    public final Handler b;
    public byte[] c;
    public String d;
    public final aaqp e;

    public lay(aaqp aaqpVar, Executor executor, Handler handler) {
        this.e = aaqpVar;
        this.a = executor;
        this.b = handler;
    }

    public static final boolean a(apzg apzgVar) {
        aupd aupdVar;
        auoz auozVar = ((auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint)).g;
        if (auozVar == null) {
            auozVar = auoz.a;
        }
        if (auozVar.b == 163011016) {
            aupdVar = (aupd) auozVar.c;
        } else {
            aupdVar = aupd.a;
        }
        return (aupdVar.b & 2) != 0;
    }
}
