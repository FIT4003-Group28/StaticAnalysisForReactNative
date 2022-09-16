package defpackage;
/* compiled from: PG */
/* renamed from: advz  reason: default package */
/* loaded from: classes.dex */
public enum advz {
    PRODUCTION("https://www.youtube.com/api/lounge", ""),
    STAGING("https://www.youtube.com/api/loungestaging", "&env_mdxEnvironment=STAGING"),
    SANDBOX("https://www.youtube.com/api/loungesandbox", "&env_mdxEnvironment=SANDBOX"),
    DEV("https://www.youtube.com/api/loungedev", "&env_mdxEnvironment=DEV");
    
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public static final advz e = PRODUCTION;

    advz(String str, String str2) {
        this.f = str.concat("/bc/bind");
        this.g = str.concat("/pairing/");
        this.h = str.concat("/screens/em");
        this.i = str2;
    }
}
