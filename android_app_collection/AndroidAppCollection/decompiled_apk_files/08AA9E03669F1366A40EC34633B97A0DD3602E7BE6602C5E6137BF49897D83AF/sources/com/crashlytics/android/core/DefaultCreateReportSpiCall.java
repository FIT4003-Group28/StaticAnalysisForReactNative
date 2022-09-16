package com.crashlytics.android.core;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.s;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.i;
import b.a.a.a.l;
import java.io.File;
import java.util.Map;
/* loaded from: classes.dex */
class DefaultCreateReportSpiCall extends a implements CreateReportSpiCall {
    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";
    static final String MULTI_FILE_PARAM = "report[file";

    public DefaultCreateReportSpiCall(i iVar, String str, String str2, e eVar) {
        super(iVar, str, str2, eVar, c.POST);
    }

    DefaultCreateReportSpiCall(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    @Override // com.crashlytics.android.core.CreateReportSpiCall
    public boolean invoke(CreateReportRequest createReportRequest) {
        d applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        l h = b.a.a.a.c.h();
        h.a(CrashlyticsCore.TAG, "Sending report to: " + getUrl());
        int b2 = applyMultipartDataTo.b();
        l h2 = b.a.a.a.c.h();
        h2.a(CrashlyticsCore.TAG, "Create report request ID: " + applyMultipartDataTo.b(a.HEADER_REQUEST_ID));
        l h3 = b.a.a.a.c.h();
        h3.a(CrashlyticsCore.TAG, "Result was: " + b2);
        return s.a(b2) == 0;
    }

    private d applyHeadersTo(d dVar, CreateReportRequest createReportRequest) {
        d a2 = dVar.a(a.HEADER_API_KEY, createReportRequest.apiKey).a(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE).a(a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        for (Map.Entry<String, String> entry : createReportRequest.report.getCustomHeaders().entrySet()) {
            a2 = a2.a(entry);
        }
        return a2;
    }

    private d applyMultipartDataTo(d dVar, Report report) {
        File[] files;
        dVar.e(IDENTIFIER_PARAM, report.getIdentifier());
        if (report.getFiles().length == 1) {
            b.a.a.a.c.h().a(CrashlyticsCore.TAG, "Adding single file " + report.getFileName() + " to report " + report.getIdentifier());
            return dVar.a(FILE_PARAM, report.getFileName(), FILE_CONTENT_TYPE, report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            b.a.a.a.c.h().a(CrashlyticsCore.TAG, "Adding file " + file.getName() + " to report " + report.getIdentifier());
            StringBuilder sb = new StringBuilder();
            sb.append(MULTI_FILE_PARAM);
            sb.append(i);
            sb.append("]");
            dVar.a(sb.toString(), file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        return dVar;
    }
}
