package defpackage;

import android.net.Uri;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: urc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class urc implements anir {
    private final /* synthetic */ int m;
    public static final /* synthetic */ urc l = new urc(11);
    public static final /* synthetic */ urc k = new urc(10);
    public static final /* synthetic */ urc j = new urc(9);
    public static final /* synthetic */ urc i = new urc(8);
    public static final /* synthetic */ urc h = new urc(7);
    public static final /* synthetic */ urc g = new urc(6);
    public static final /* synthetic */ urc f = new urc(5);
    public static final /* synthetic */ urc e = new urc(4);
    public static final /* synthetic */ urc d = new urc(3);
    public static final /* synthetic */ urc c = new urc(2);
    public static final /* synthetic */ urc b = new urc(1);
    public static final /* synthetic */ urc a = new urc();

    private /* synthetic */ urc() {
    }

    private /* synthetic */ urc(int i2) {
        this.m = i2;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        switch (this.m) {
            case 0:
                IOException iOException = (IOException) obj;
                qsp qspVar = (qsp) zgd.U(iOException, qsp.class);
                if (qspVar == null || qspVar.a() != 10) {
                    return anlz.p(iOException);
                }
                return anlz.p(new MdiNotAvailableException$DeveloperErrorException());
            case 1:
                qsp qspVar2 = (qsp) obj;
                if (qspVar2.a() == 17) {
                    return anlz.p(new MdiNotAvailableException$ApiNotConnectedException());
                }
                return anlz.p(qspVar2);
            case 2:
                qsp qspVar3 = (qsp) obj;
                throw new vby(qspVar3.a(), qspVar3.getMessage(), qspVar3);
            case 3:
                Uri uri = (Uri) obj;
                return anlz.q("");
            case 4:
                return ((yvc) obj).a();
            case 5:
                return ((vne) obj).a();
            case 6:
                return ((vmu) obj).a.a();
            case 7:
                return anlz.p(aahd.a(new IllegalArgumentException("Commit aborted due to an exception during PendingEdits execution", (Throwable) obj), 4));
            case 8:
                atbu[] atbuVarArr = (atbu[]) obj;
                if (atbuVarArr == null) {
                    return anlz.q(amuk.q());
                }
                return anlz.q(amuk.p(atbuVarArr));
            case 9:
                return anlz.p(new agot((Throwable) obj));
            case 10:
                return ((agvx) obj).m().i();
            default:
                return ((agvx) obj).m().i();
        }
    }
}
