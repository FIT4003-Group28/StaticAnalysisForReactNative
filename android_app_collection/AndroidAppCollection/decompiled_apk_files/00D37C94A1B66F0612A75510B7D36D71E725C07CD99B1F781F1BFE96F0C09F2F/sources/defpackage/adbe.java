package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import j$.util.stream.Stream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/* compiled from: PG */
/* renamed from: adbe  reason: default package */
/* loaded from: classes.dex */
public final class adbe {
    public static final String a = zep.a("MDX.DialDeviceFinder");
    static final Pattern b = Pattern.compile("^(.+?): (.+)$");
    static final Object c = new Object();
    public static DatagramPacket d;
    public final String e;
    public final ScheduledExecutorService f;
    public final yqh g;
    public final Set h;
    public final Set i;
    public final Set j;
    public final Map k;
    public boolean l;
    public final adbq m;
    public final adwc n;
    public final acrr o;
    public final snc p;
    public final Map q;
    public final adao r;
    private final adas s;
    private final azqb t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final acwu x;

    public adbe(String str, adas adasVar, azqb azqbVar, yqh yqhVar, adao adaoVar, adwc adwcVar, acrr acrrVar, snc sncVar, boolean z, acwu acwuVar) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new yli("mdxSsdp"));
        adbp adbpVar = new adbp();
        this.q = new HashMap();
        this.j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.h = Collections.newSetFromMap(new ConcurrentHashMap());
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f = newScheduledThreadPool;
        this.k = new ConcurrentHashMap();
        this.e = str;
        this.s = adasVar;
        this.t = azqbVar;
        this.g = yqhVar;
        this.m = adbpVar;
        this.n = adwcVar;
        this.o = acrrVar;
        this.p = sncVar;
        this.u = z;
        this.v = acwuVar.m;
        this.w = acwuVar.s;
        this.r = adaoVar;
        this.x = acwuVar;
    }

    public static String g(Element element, String str) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if ((item instanceof Element) && str.equals(item.getLocalName()) && "urn:schemas-upnp-org:device-1-0".equals(item.getNamespaceURI())) {
                return item.getTextContent();
            }
        }
        return null;
    }

    private final boolean i(AppStatus appStatus) {
        int i = ((AutoValue_AppStatus) appStatus).a;
        return i == -2 || i == -1 || (!this.v && i == 0);
    }

    public final void a() {
        this.j.clear();
        this.h.clear();
    }

    public final void b(adbb adbbVar) {
        c(adbbVar, true);
    }

    public final void c(final adbb adbbVar, boolean z) {
        this.i.add(adbbVar);
        if (this.l) {
            for (adid adidVar : this.h) {
                adbbVar.a(adidVar);
            }
            return;
        }
        if (z && this.w) {
            final String b2 = this.n.b();
            if (!b2.isEmpty() && !b2.equals("<unknown ssid>")) {
                final adao adaoVar = this.r;
                ylx.i(anii.h(adaoVar.j.a(), new ampg() { // from class: adan
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        int e;
                        adao adaoVar2 = adao.this;
                        String str = b2;
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : Collections.unmodifiableMap(((awts) obj).c).entrySet()) {
                            String str2 = (String) entry.getKey();
                            awtp awtpVar = (awtp) entry.getValue();
                            awtq awtqVar = awtpVar.d;
                            if (awtqVar == null) {
                                awtqVar = awtq.a;
                            }
                            int g = awwc.g(awtqVar.g);
                            if (g != 0 && g == 3) {
                                awtq awtqVar2 = awtpVar.d;
                                if (awtqVar2 == null) {
                                    awtqVar2 = awtq.a;
                                }
                                if ((awtqVar2.b & 64) != 0) {
                                    awtq awtqVar3 = awtpVar.d;
                                    if (awtqVar3 == null) {
                                        awtqVar3 = awtq.a;
                                    }
                                    awtu awtuVar = awtqVar3.i;
                                    if (awtuVar == null) {
                                        awtuVar = awtu.a;
                                    }
                                    if (awtuVar.c.equals(str)) {
                                        awtq awtqVar4 = awtpVar.d;
                                        if (awtqVar4 == null) {
                                            awtqVar4 = awtq.a;
                                        }
                                        awtu awtuVar2 = awtqVar4.i;
                                        if (awtuVar2 == null) {
                                            awtuVar2 = awtu.a;
                                        }
                                        if (!awtuVar2.d.isEmpty()) {
                                            if (adaoVar2.i) {
                                                awtq awtqVar5 = awtpVar.d;
                                                if (awtqVar5 == null) {
                                                    awtqVar5 = awtq.a;
                                                }
                                                if (!TextUtils.isEmpty(awtqVar5.c)) {
                                                }
                                            }
                                            long c2 = adaoVar2.b.c();
                                            awtq awtqVar6 = awtpVar.d;
                                            if (awtqVar6 == null) {
                                                awtqVar6 = awtq.a;
                                            }
                                            awtu awtuVar3 = awtqVar6.i;
                                            if (awtuVar3 == null) {
                                                awtuVar3 = awtu.a;
                                            }
                                            long j = awtuVar3.f;
                                            if (j >= 0 && j <= c2 && j + adaoVar2.d >= c2) {
                                                long j2 = adaoVar2.f;
                                                if (j2 > 0 && c2 > j2) {
                                                    long j3 = c2 - j2;
                                                    int i = 0;
                                                    int i2 = 0;
                                                    for (awtt awttVar : Collections.unmodifiableMap(awtpVar.e).values()) {
                                                        if (awttVar.e >= j3 && (e = awwc.e(awttVar.c)) != 0 && e == 4) {
                                                            i++;
                                                            int f = awwc.f(awttVar.d);
                                                            if (f != 0 && f == 3) {
                                                                i2++;
                                                            }
                                                        }
                                                    }
                                                    double d2 = i > 0 ? i2 / i : 1.0d;
                                                    if (i >= adaoVar2.g && d2 < adaoVar2.h) {
                                                    }
                                                }
                                                adic h = adid.h();
                                                h.j = new adit(str2);
                                                awtq awtqVar7 = awtpVar.d;
                                                if (awtqVar7 == null) {
                                                    awtqVar7 = awtq.a;
                                                }
                                                h.d = awtqVar7.c;
                                                awtq awtqVar8 = awtpVar.d;
                                                if (awtqVar8 == null) {
                                                    awtqVar8 = awtq.a;
                                                }
                                                h.e = awtqVar8.d;
                                                awtq awtqVar9 = awtpVar.d;
                                                if (awtqVar9 == null) {
                                                    awtqVar9 = awtq.a;
                                                }
                                                h.b(awtqVar9.f);
                                                awtq awtqVar10 = awtpVar.d;
                                                if (awtqVar10 == null) {
                                                    awtqVar10 = awtq.a;
                                                }
                                                awtu awtuVar4 = awtqVar10.i;
                                                if (awtuVar4 == null) {
                                                    awtuVar4 = awtu.a;
                                                }
                                                h.c(awtuVar4.c);
                                                awtq awtqVar11 = awtpVar.d;
                                                if (awtqVar11 == null) {
                                                    awtqVar11 = awtq.a;
                                                }
                                                awtu awtuVar5 = awtqVar11.i;
                                                if (awtuVar5 == null) {
                                                    awtuVar5 = awtu.a;
                                                }
                                                h.h = awtuVar5.d;
                                                awtq awtqVar12 = awtpVar.d;
                                                if (awtqVar12 == null) {
                                                    awtqVar12 = awtq.a;
                                                }
                                                awtu awtuVar6 = awtqVar12.i;
                                                if (awtuVar6 == null) {
                                                    awtuVar6 = awtu.a;
                                                }
                                                h.d(awtuVar6.e);
                                                h.e(1);
                                                adhw c3 = AppStatus.c();
                                                c3.e(-2);
                                                awtq awtqVar13 = awtpVar.d;
                                                if (awtqVar13 == null) {
                                                    awtqVar13 = awtq.a;
                                                }
                                                String str3 = awtqVar13.j;
                                                awtq awtqVar14 = awtpVar.d;
                                                if (awtqVar14 == null) {
                                                    awtqVar14 = awtq.a;
                                                }
                                                c3.b(amup.l("brand", str3, "model", awtqVar14.k));
                                                h.a = c3.a();
                                                arrayList.add(h.a());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return arrayList;
                    }
                }, anjk.a), new ylw() { // from class: adat
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        final adbb adbbVar2 = adbb.this;
                        Stream stream = Collection.EL.stream((List) obj);
                        adbbVar2.getClass();
                        stream.forEach(new Consumer() { // from class: aday
                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj2) {
                                adbb.this.a((adid) obj2);
                            }

                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return consumer.getClass();
                            }
                        });
                    }
                });
            }
        }
        this.l = true;
        this.f.execute(new adaw(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0105 A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0025, B:8:0x0038, B:10:0x0044, B:12:0x004e, B:20:0x008c, B:13:0x0071, B:16:0x007b, B:19:0x0085, B:21:0x008f, B:22:0x009d, B:24:0x00bf, B:26:0x00d7, B:28:0x00ec, B:30:0x0105, B:32:0x011a, B:34:0x0120, B:36:0x0138, B:43:0x017a, B:46:0x0182, B:49:0x018d, B:51:0x0191, B:57:0x01a5, B:53:0x0199, B:55:0x019d, B:58:0x01ad, B:60:0x01b1, B:62:0x01bb, B:68:0x01fe, B:63:0x01c4, B:65:0x01ce, B:66:0x01ed, B:67:0x01f6, B:39:0x014e, B:41:0x0166), top: B:78:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120 A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0025, B:8:0x0038, B:10:0x0044, B:12:0x004e, B:20:0x008c, B:13:0x0071, B:16:0x007b, B:19:0x0085, B:21:0x008f, B:22:0x009d, B:24:0x00bf, B:26:0x00d7, B:28:0x00ec, B:30:0x0105, B:32:0x011a, B:34:0x0120, B:36:0x0138, B:43:0x017a, B:46:0x0182, B:49:0x018d, B:51:0x0191, B:57:0x01a5, B:53:0x0199, B:55:0x019d, B:58:0x01ad, B:60:0x01b1, B:62:0x01bb, B:68:0x01fe, B:63:0x01c4, B:65:0x01ce, B:66:0x01ed, B:67:0x01f6, B:39:0x014e, B:41:0x0166), top: B:78:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018d A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0025, B:8:0x0038, B:10:0x0044, B:12:0x004e, B:20:0x008c, B:13:0x0071, B:16:0x007b, B:19:0x0085, B:21:0x008f, B:22:0x009d, B:24:0x00bf, B:26:0x00d7, B:28:0x00ec, B:30:0x0105, B:32:0x011a, B:34:0x0120, B:36:0x0138, B:43:0x017a, B:46:0x0182, B:49:0x018d, B:51:0x0191, B:57:0x01a5, B:53:0x0199, B:55:0x019d, B:58:0x01ad, B:60:0x01b1, B:62:0x01bb, B:68:0x01fe, B:63:0x01c4, B:65:0x01ce, B:66:0x01ed, B:67:0x01f6, B:39:0x014e, B:41:0x0166), top: B:78:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(java.lang.String r9, defpackage.adid r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbe.d(java.lang.String, adid, java.util.Map):void");
    }

    public final void e(DatagramSocket datagramSocket) {
        int i;
        boolean z;
        int i2 = 2000;
        try {
            datagramSocket.setSoTimeout(2000);
        } catch (SocketException e) {
            zep.f(a, "Error setting socket timeout", e);
        }
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
        final byte[] bArr = new byte[512];
        ArrayList<Future> arrayList = new ArrayList();
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                datagramSocket.receive(datagramPacket);
                z = true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                if (!datagramSocket.isClosed()) {
                    zep.f(a, "Error receiving m search response packet", e2);
                }
                z = false;
            }
            i2 -= (int) (System.currentTimeMillis() - currentTimeMillis);
            if (i2 <= 0) {
                break;
            } else if (z) {
                String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                if (this.u && str.length() != 0) {
                    "ssdp response: ".concat(str);
                }
                final HashMap hashMap = new HashMap();
                Matcher matcher = b.matcher("");
                Scanner scanner = new Scanner(str);
                while (scanner.hasNextLine()) {
                    matcher.reset(scanner.nextLine());
                    if (matcher.matches()) {
                        hashMap.put(matcher.group(1).toUpperCase(Locale.US), matcher.group(2));
                    }
                }
                scanner.close();
                Future future = null;
                if ("urn:dial-multiscreen-org:service:dial:1".equals(hashMap.get("ST"))) {
                    final String str2 = (String) hashMap.get("LOCATION");
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(Uri.parse(str2).getHost())) {
                        String str3 = a;
                        String valueOf = String.valueOf(str2);
                        zep.m(str3, valueOf.length() != 0 ? "Ignoring device with unusable LOCATION: ".concat(valueOf) : new String("Ignoring device with unusable LOCATION: "));
                    } else if (!this.j.contains(str2)) {
                        this.j.add(str2);
                        if (this.k.containsKey(str2)) {
                            d(str2, (adid) this.k.get(str2), hashMap);
                        } else {
                            future = this.f.submit(new Callable() { // from class: adax
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    adbe adbeVar = adbe.this;
                                    String str4 = str2;
                                    Map map = hashMap;
                                    byte[] bArr2 = bArr;
                                    yqu b2 = yqv.b(str4);
                                    b2.c("Origin", "package:com.google.android.youtube");
                                    adyf.d(adbeVar.g, b2.a(), new adaz(adbeVar, map, bArr2, str4));
                                    return null;
                                }
                            });
                        }
                    }
                }
                if (future != null) {
                    arrayList.add(future);
                }
            }
        }
        int size = arrayList.size();
        long j = 7300;
        for (i = 0; i < size; i++) {
            Future future2 = (Future) arrayList.get(i);
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                future2.get(j, TimeUnit.MILLISECONDS);
                j = Math.max(0L, j - (System.currentTimeMillis() - currentTimeMillis2));
            } catch (InterruptedException unused2) {
                zep.c(a, "Read device response task cancelled while waiting for reading device description task to complete");
                for (Future future3 : arrayList) {
                    future3.cancel(true);
                }
                return;
            } catch (ExecutionException e3) {
                zep.f(a, "Error waiting for reading device description task to complete", e3);
            } catch (TimeoutException e4) {
                zep.f(a, "Timed out whilst reading device description", e4);
            }
        }
    }

    public final void f(adbb adbbVar) {
        this.i.remove(adbbVar);
    }

    public final int h() {
        String b2 = this.n.b();
        if (b2.isEmpty() || b2.equals("<unknown ssid>")) {
            return 1;
        }
        return b2.equals(this.n.b()) ? 2 : 3;
    }
}
