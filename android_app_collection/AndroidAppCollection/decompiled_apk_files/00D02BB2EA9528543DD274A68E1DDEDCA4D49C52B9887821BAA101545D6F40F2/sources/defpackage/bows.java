package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bows  reason: default package */
/* loaded from: classes3.dex */
public class bows implements Serializable {
    @dzsi
    public final akqq a;
    @dzsi
    public akqq b;
    @dzsi
    public akqq c;
    @dzsi
    public dory d;
    public Boolean e;
    public dory f;
    public Boolean g;
    @dzsi
    public String h;

    public bows(@dzsi akqq akqqVar) {
        this(akqqVar, false);
        this.b = akqqVar;
        if (akqqVar != null) {
            this.f = dory.PRE_FILLED;
        } else {
            this.f = dory.UNSPECIFIED;
        }
    }

    public final boolean a() {
        return this.b != null;
    }

    public bows(@dzsi akqq akqqVar, Boolean bool) {
        this.g = false;
        this.a = akqqVar;
        this.f = dory.UNSPECIFIED;
        this.e = bool;
    }
}
