package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Impp;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: ImppScribe.java */
/* loaded from: classes.dex */
public class w extends bg<Impp> {

    /* renamed from: a  reason: collision with root package name */
    private static final List<a> f5489a;

    public w() {
        super(Impp.class, "IMPP");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f5461d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Impp b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        return a(com.b.a.a.b.e.a(str));
    }

    private Impp a(String str) {
        if (str == null || str.length() == 0) {
            return new Impp((URI) null);
        }
        try {
            return new Impp(str);
        } catch (IllegalArgumentException e) {
            throw new ezvcard.a.a(15, str, e.getMessage());
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("aim", "(goim|addbuddy)\\?.*?\\bscreenname=(.*?)(&|$)", 2, "goim?screenname=%s"));
        arrayList.add(new a("ymsgr", "(sendim|addfriend|sendfile|call)\\?(.*)", 2, "sendim?%s"));
        arrayList.add(new a("skype", "(.*?)(\\?|$)", 1, "%s"));
        arrayList.add(new a("msnim", "(chat|add|voice|video)\\?contact=(.*?)(&|$)", 2, "chat?contact=%s"));
        arrayList.add(new a("xmpp", "(.*?)(\\?|$)", 1, "%s?message"));
        arrayList.add(new a("icq", "message\\?uin=(\\d+)", 1, "message?uin=%s"));
        arrayList.add(new a("sip"));
        arrayList.add(new a("irc"));
        f5489a = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: ImppScribe.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Pattern f5490a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5491b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5492c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5493d;

        public a(String str) {
            this(str, "(.*)", 1, "%s");
        }

        public a(String str, String str2, int i, String str3) {
            this.f5490a = Pattern.compile('^' + str + ':' + str2, 2);
            this.f5491b = str;
            this.f5492c = i;
            this.f5493d = str + ':' + str3;
        }
    }
}
