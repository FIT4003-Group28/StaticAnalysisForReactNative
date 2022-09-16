package defpackage;
/* compiled from: PG */
/* renamed from: dasn  reason: default package */
/* loaded from: classes5.dex */
enum dasn {
    PLUS('+', "", ",", false, true),
    HASH('#', "#", ",", false, true),
    DOT('.', ".", ".", false, false),
    FORWARD_SLASH('/', "/", "/", false, false),
    SEMI_COLON(';', ";", ";", true, false),
    QUERY('?', "?", "&", true, false),
    AMP('&', "&", "&", true, false),
    SIMPLE(null, "", ",", false, false);
    
    public final Character i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;

    dasn(Character ch, String str, String str2, boolean z, boolean z2) {
        this.i = ch;
        this.j = str;
        this.k = str2;
        this.l = z;
        this.m = z2;
        if (ch != null) {
            daso.a.put(ch, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        if (this.m) {
            return davc.c(str);
        }
        return davc.a(str);
    }
}
