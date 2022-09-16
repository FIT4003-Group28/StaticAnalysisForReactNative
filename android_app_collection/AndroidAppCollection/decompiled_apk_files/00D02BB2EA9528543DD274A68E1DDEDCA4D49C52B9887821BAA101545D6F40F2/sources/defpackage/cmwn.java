package defpackage;
/* compiled from: PG */
/* renamed from: cmwn  reason: default package */
/* loaded from: classes5.dex */
public final class cmwn extends Exception {
    private static final long serialVersionUID = 8656048008787472565L;

    public cmwn() {
    }

    public cmwn(Exception exc) {
        super(exc);
    }

    public cmwn(String str) {
        super("could not find a manager for the given serviceName:  serviceName = info");
    }
}
