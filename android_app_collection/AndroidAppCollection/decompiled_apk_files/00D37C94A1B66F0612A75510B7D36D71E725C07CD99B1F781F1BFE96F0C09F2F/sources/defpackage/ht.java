package defpackage;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
/* compiled from: PG */
/* renamed from: ht  reason: default package */
/* loaded from: classes3.dex */
public final class ht {
    public final Signature a;
    public final Cipher b;
    public final Mac c;

    public ht(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
    }

    public ht(Cipher cipher) {
        this.b = cipher;
        this.a = null;
        this.c = null;
    }

    public ht(Mac mac) {
        this.c = mac;
        this.b = null;
        this.a = null;
    }
}
