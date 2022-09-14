package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cvjm  reason: default package */
/* loaded from: classes5.dex */
public final class cvjm extends cvjq {
    public String a;
    public List<String> b;
    public String c;
    public cvjr d;
    public cvjt e;
    public String f;
    public Long g;
    public String h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Boolean l;

    @Override // defpackage.cvjq
    public final void a(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null deviceName");
    }

    @Override // defpackage.cvjq
    public final void b(Long l) {
        if (l != null) {
            this.g = l;
            return;
        }
        throw new NullPointerException("Null registrationStalenessTimeMs");
    }
}
