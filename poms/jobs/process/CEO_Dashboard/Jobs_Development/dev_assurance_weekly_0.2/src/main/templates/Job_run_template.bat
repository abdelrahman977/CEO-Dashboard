%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/log4j-slf4j-impl-2.12.1.jar;../lib/log4j-api-2.12.1.jar;../lib/log4j-core-2.12.1.jar;../lib/log4j-1.2-api-2.12.1.jar;../lib/commons-collections-3.2.2.jar;../lib/geronimo-stax-api_1.0_spec-1.0.1.jar;../lib/poi-ooxml-4.1.0-20190523141255_modified_talend.jar;../lib/commons-compress-1.19.jar;../lib/jaxen-1.1.6.jar;../lib/poi-scratchpad-4.1.0-20190523141255_modified_talend.jar;../lib/poi-ooxml-schemas-4.1.0-20190523141255_modified_talend.jar;../lib/slf4j-api-1.7.25.jar;../lib/commons-math3-3.6.1.jar;../lib/xmlbeans-3.1.0.jar;../lib/commons-collections4-4.1.jar;../lib/commons-io-2.4.jar;../lib/jboss-serialization.jar;../lib/thashfile-3.1-20190910.jar;../lib/advancedPersistentLookupLib-1.2.jar;../lib/dom4j-2.1.1.jar;../lib/poi-4.1.0-20190523141255_modified_talend.jar;../lib/xpathutil-1.0.0.jar;../lib/external_sort.jar;../lib/trove.jar;../lib/talendcsv.jar;../lib/crypto-utils.jar;../lib/talend_file_enhanced_20070724.jar;dev_assurance_weekly_0_2.jar; ceo_dashboard.dev_assurance_weekly_0_2.dev_assurance_weekly  %*