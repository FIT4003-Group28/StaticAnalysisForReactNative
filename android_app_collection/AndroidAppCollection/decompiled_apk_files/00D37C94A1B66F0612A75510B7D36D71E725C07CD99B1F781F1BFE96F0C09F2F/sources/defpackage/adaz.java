package defpackage;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* compiled from: PG */
/* renamed from: adaz  reason: default package */
/* loaded from: classes.dex */
final class adaz implements adwb {
    final /* synthetic */ Map a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ String c;
    final /* synthetic */ adbe d;

    public adaz(adbe adbeVar, Map map, byte[] bArr, String str) {
        this.d = adbeVar;
        this.a = map;
        this.b = bArr;
        this.c = str;
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        String str = adbe.a;
        String valueOf = String.valueOf(this.c);
        zep.f(str, valueOf.length() != 0 ? "Error reading device description from ".concat(valueOf) : new String("Error reading device description from "), iOException);
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        adbe adbeVar = this.d;
        Map map = this.a;
        byte[] bArr = this.b;
        yqp yqpVar = yrbVar.c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : yqpVar.b) {
            if ("Application-URL".equalsIgnoreCase((String) entry.getKey())) {
                arrayList.add((String) entry.getValue());
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        adid adidVar = null;
        if (unmodifiableList.size() != 1) {
            zep.c(adbe.a, "Expected one Application-URL header. Found 0 or more");
        } else {
            yqz yqzVar = yrbVar.d;
            if (yqzVar != null) {
                try {
                    InputStream b = yqzVar.b();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    synchronized (adbe.c) {
                        while (true) {
                            int read = b.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
                    newInstance.setNamespaceAware(true);
                    NodeList elementsByTagName = newInstance.newDocumentBuilder().parse(new ByteArrayInputStream(byteArray)).getDocumentElement().getElementsByTagName("device");
                    if (elementsByTagName.getLength() == 0) {
                        zep.c(adbe.a, "No devices found in device description XML.");
                    } else {
                        Element element = (Element) elementsByTagName.item(0);
                        String g = adbe.g(element, "friendlyName");
                        adic h = adid.h();
                        h.b(g);
                        h.j = new adit(adbe.g(element, "UDN"));
                        h.d = adbe.g(element, "manufacturer");
                        h.e = adbe.g(element, "modelName");
                        h.f = adbe.g(element, "modelNumber");
                        h.g = (String) map.get("SERVER");
                        h.c(adbeVar.n.b());
                        String str = (String) unmodifiableList.get(0);
                        if (str != null) {
                            Uri parse = Uri.parse(str);
                            Uri build = parse.buildUpon().appendPath(adbeVar.e).build();
                            h.c = parse;
                            h.b = build;
                        }
                        h.e(3);
                        h.i = adbeVar.h();
                        adidVar = h.a();
                    }
                } catch (Exception e) {
                    zep.f(adbe.a, "Error parsing device description response: ", e);
                }
            } else {
                zep.m(adbe.a, "no body found in response");
            }
        }
        if (adidVar != null) {
            this.d.d(this.c, adidVar, this.a);
        }
    }
}
