package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: anxc  reason: default package */
/* loaded from: classes.dex */
public final class anxc extends qxb {
    public static final qso a;
    private static final twx b;
    private static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        anxb anxbVar = new anxb();
        c = anxbVar;
        a = new qso("AppIndexing.API", anxbVar, twxVar, null, null, null);
    }

    public anxc(Context context, Looper looper, qwu qwuVar, qsv qsvVar, qsw qswVar) {
        super(context, looper, 113, qwuVar, qsvVar, qswVar);
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof anxj) {
            return (anxj) queryLocalInterface;
        }
        return new anxj(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }
}
